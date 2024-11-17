package coding_LV2;

import java.util.*;

public class FriendsFourBlock {
    private static int markBlocks(int m, int n, char[][] map, boolean[][] marked) {
        int count = 0;

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                char current = map[i][j];
                if (current != ' '
                        && current == map[i][j + 1]
                        && current == map[i + 1][j]
                        && current == map[i + 1][j + 1]) {
                    marked[i][j] = marked[i][j + 1] = marked[i + 1][j] = marked[i + 1][j + 1] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (marked[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private static void dropBlocks(int m, int n, char[][] map, boolean[][] marked) {
        for (int j = 0; j < n; j++) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < m; i++) {
                if (!marked[i][j]) {
                    stack.push(map[i][j]);
                }
            }

            for (int i = m - 1; i >= 0; i--) {
                if (!stack.isEmpty()) {
                    map[i][j] = stack.pop();
                } else {
                    map[i][j] = ' ';
                }
            }
        }
    }

    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        int totalRemoved = 0;

        while (true) {
            boolean[][] marked = new boolean[m][n];
            int removed = markBlocks(m, n, map, marked);
            if (removed == 0) break;

            totalRemoved += removed;
            dropBlocks(m, n, map, marked);
        }

        return totalRemoved;
    }
}
