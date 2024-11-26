package coding_LV2;

import java.util.*;

public class CreateStarAtTheIntersection {
    private long[] getIntersection(int[] line1, int[] line2) {
        long A = line1[0], B = line1[1], C = line1[2];
        long D = line2[0], E = line2[1], F = line2[2];

        long denominator = A * E - B * D;

        if (denominator == 0) {
            return null;
        }

        long xNumerator = B * F - C * E;
        long yNumerator = C * D - A * F;

        if (xNumerator % denominator != 0 || yNumerator % denominator != 0) {
            return null;
        }

        long x = xNumerator / denominator;
        long y = yNumerator / denominator;
        return new long[]{x, y};
    }

    public String[] solution(int[][] line) {
        List<long[]> points = new ArrayList<>();

        int n = line.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long[] point = getIntersection(line[i], line[j]);
                if (point != null) {
                    points.add(point);
                }
            }
        }

        long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;

        for (long[] point : points) {
            minX = Math.min(minX, point[0]);
            minY = Math.min(minY, point[1]);
            maxX = Math.max(maxX, point[0]);
            maxY = Math.max(maxY, point[1]);
        }

        int width = (int) (maxX - minX + 1);
        int height = (int) (maxY - minY + 1);

        char[][] grid = new char[height][width];
        for (char[] row : grid) {
            Arrays.fill(row, '.');
        }

        for (long[] point : points) {
            int x = (int) (point[0] - minX);
            int y = (int) (maxY - point[1]);
            grid[y][x] = '*';
        }

        String[] result = new String[height];
        for (int i = 0; i < height; i++) {
            result[i] = new String(grid[i]);
        }

        return result;
    }
}
