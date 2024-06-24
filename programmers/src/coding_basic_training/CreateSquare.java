package coding_basic_training;

public class CreateSquare {
    public int[][] solution(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        int newSize = Math.max(numRows, numCols);

        int[][] result = new int[newSize][newSize];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
}
