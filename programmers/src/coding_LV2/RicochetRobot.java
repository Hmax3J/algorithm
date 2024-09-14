package coding_LV2;

import java.util.*;

public class RicochetRobot {
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y, moves;

        Point(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }

    public int solution(String[] board) {
        int n = board.length;
        int m = board[0].length();
        char[][] grid = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        Point start = null, goal = null;

        for (int i = 0; i < n; i++) {
            grid[i] = board[i].toCharArray();
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'R') {
                    start = new Point(i, j, 0);
                } else if (grid[i][j] == 'G') {
                    goal = new Point(i, j, 0);
                }
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == goal.x && current.y == goal.y) {
                return current.moves;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x;
                int ny = current.y;

                while (true) {
                    int tx = nx + dx[i];
                    int ty = ny + dy[i];

                    if (tx < 0 || tx >= n || ty < 0 ||
                            ty >= m || grid[tx][ty] == 'D') {
                        break;
                    }

                    nx = tx;
                    ny = ty;
                }

                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new Point(nx, ny, current.moves + 1));
                }
            }
        }

        return -1;
    }
}
