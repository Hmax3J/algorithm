package graph.bfs;

import java.util.ArrayDeque;

public class GameMapShortestPathFinderBrushUp3 {
    private static final int[] rx = {0, 0, 1, -1};
    private static final int[] ry = {1, -1, 0, 0};

    private static class Node {
        int r, c;

        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int N = maps.length;
        int M = maps[0].length;

        int[][] dist = new int[N][M];
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(new Node(0, 0));
        dist[0][0] = 1;

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = now.r + rx[i];
                int nc = now.c + ry[i];

                if (nr < 0 || nc < 0 || nr >= N || nc >= M) continue;
                if (maps[nr][nc] == 0) continue;

                if (dist[nr][nc] == 0) {
                    queue.add(new Node(nr, nc));
                    dist[nr][nc] = dist[now.r][now.c] + 1;
                }
            }
        }
        System.out.println(dist[N - 1][M - 1]);
    }
}
