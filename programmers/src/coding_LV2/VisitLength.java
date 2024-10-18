package coding_LV2;

import java.util.*;

public class VisitLength {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;

        HashSet<String> visited = new HashSet<>();

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        String move = "UDRL";

        int count = 0;

        for (char dir : dirs.toCharArray()) {
            int direction = move.indexOf(dir);
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }

            String path1 = encodePath(x, y, nx, ny);
            String path2 = encodePath(nx, ny, x, y);

            if (!visited.contains(path1) && !visited.contains(path2)) {
                visited.add(path1);
                visited.add(path2);
                count++;
            }

            x = nx;
            y = ny;
        }

        return count;
    }

    private String encodePath(int x1, int y1, int x2, int y2) {
        return x1 + "," + y1 + "->" + x2 + "," + y2;
    }
}
