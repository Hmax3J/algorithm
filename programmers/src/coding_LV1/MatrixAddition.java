package coding_LV1;

public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[0].length == 1) {
                answer[i][0] = arr1[i][0] + arr2[i][0];
            } else {
                for (int j = 0; j < arr1[0].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

        }

        return answer;
    }
}
