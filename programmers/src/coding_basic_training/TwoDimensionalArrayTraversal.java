package coding_basic_training;

public class TwoDimensionalArrayTraversal {
    public int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length && i + j <= k; j++) {
                answer += board[i][j];
            }
        }

        return answer;
    }
}
