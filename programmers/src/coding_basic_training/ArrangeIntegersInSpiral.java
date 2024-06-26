package coding_basic_training;

public class ArrangeIntegersInSpiral {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int row = 0, col = 0;
        int direction = 0;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for (int i = 0; i < n * n; i++) {
            answer[row][col] = num;
            num++;

            int nextRow = row + dr[direction];
            int nextCol = col + dc[direction];

            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || answer[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 4;
                nextRow = row + dr[direction];
                nextCol = col + dc[direction];
            }

            row = nextRow;
            col = nextCol;
        }

        return answer;
    }
}
