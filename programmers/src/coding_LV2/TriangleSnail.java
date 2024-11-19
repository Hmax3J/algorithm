package coding_LV2;

import java.util.*;

public class TriangleSnail {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];

        int num = 1;
        int x = -1, y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                triangle[x][y] = num++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result.add(triangle[i][j]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
