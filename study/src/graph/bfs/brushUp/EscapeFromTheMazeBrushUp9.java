package graph.bfs;

import java.util.ArrayDeque;

public class EscapeFromTheMazeBrushUp9 {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    private static class Point {
        int nx, ny;

        public Point(int nx, int ny) {
            this.nx = nx;
            this.ny = ny;
        }
    }

    private static char[][] map;
    private static int N, M;

    public static void main(String[] args) {
        String[] maps = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
        N = maps.length;
        M = maps[0].length();
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = maps[i].toCharArray();
        }

        Point start = null, end = null, lever = null;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'S') start = new Point(j, i);
                else if (map[i][j] == 'E') end = new Point(j, i);
                else if (map[i][j] == 'L') lever = new Point(j, i);
            }
        }

        int startLever = bfs(start, lever);
        int leverEnd = bfs(lever, end);

        if (startLever == -1 || leverEnd == -1) System.out.println(-1);
        else System.out.println(startLever + leverEnd);
    }

    private static int bfs(Point start, Point end) {
        int[][] dist = new int[N][M];
        ArrayDeque<Point> queue = new ArrayDeque<>();
        dist[start.ny][start.nx] = 1;
        queue.add(start);

        while (!queue.isEmpty()) {
            Point now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = now.nx + dx[i];
                int nextY = now.ny + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) continue;
                if (dist[nextY][nextX] > 0) continue;
                if (map[nextY][nextX] == 'X') continue;

                dist[nextY][nextX] = dist[now.ny][now.nx] + 1;
                queue.add(new Point(nextX, nextY));

                if (nextX == end.nx && nextY == end.ny) {
                    return dist[end.ny][end.nx] - 1;
                }
            }
        }
        return -1;
    }
}
