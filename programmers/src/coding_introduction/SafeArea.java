package coding_introduction;

public class SafeArea {
    public int solution(int[][] board) {
        return countSafeAreas(board);
    }

    public static int countSafeAreas(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] dangerZone = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    markDangerZones(dangerZone, i, j);
                }
            }
        }

        int safeCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!dangerZone[i][j]) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }

    private static void markDangerZones(boolean[][] dangerZone, int x, int y) {
        int rows = dangerZone.length;
        int cols = dangerZone[0].length;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        dangerZone[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                dangerZone[nx][ny] = true;
            }
        }
    }
}
