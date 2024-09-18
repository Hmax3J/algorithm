package coding_LV2;

import java.util.*;

public class DesertIslandTrip {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int[] solution(String[] maps) {
        int rows = maps.length;
        int cols = maps[0].length();

        boolean[][] visited = new boolean[rows][cols];
        List<Integer> islands = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    islands.add(bfs(maps, visited, i, j, rows, cols));
                }
            }
        }

        Collections.sort(islands);

        return islands.isEmpty() ?
                new int[] {-1} :
                islands.stream().mapToInt(Integer::intValue).toArray();
    }

    public int bfs(String[] maps, boolean[][] visited, int x, int y, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        int totalFood = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            totalFood += maps[cx].charAt(cy) - '0';

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols
                        && maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }

        return totalFood;
    }
}
