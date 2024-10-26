package coding_LV2;

public class EatingTheLand {
    int solution(int[][] land) {
        int rows = land.length;
        int cols = land[0].length;

        for (int i = 1; i < rows; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        return Math.max(land[rows - 1][0], Math.max(land[rows - 1][1], Math.max(land[rows - 1][2], land[rows - 1][3])));
    }
}
