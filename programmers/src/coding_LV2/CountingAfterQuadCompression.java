package coding_LV2;

public class CountingAfterQuadCompression {
    private int[] result = new int[2];

    public int[] solution(int[][] arr) {
        compress(arr, 0, 0, arr.length);
        return result;
    }

    private void compress(int[][] arr, int row, int col, int size) {
        if (isUniform(arr, row, col, size)) {
            result[arr[row][col]]++;
        } else {
            int newSize = size / 2;
            compress(arr, row, col, newSize);
            compress(arr, row, col + newSize, newSize);
            compress(arr, row + newSize, col, newSize);
            compress(arr, row + newSize, col + newSize, newSize);
        }
    }

    private boolean isUniform(int[][] arr, int row, int col, int size) {
        int value = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}
