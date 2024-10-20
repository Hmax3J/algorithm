package coding_LV2;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int row = 3; row <= total / 3; row++) {
            if (total % row == 0) {
                int col = total / row;

                if ((col - 2) * (row - 2) == yellow) {
                    return new int[] {col, row};
                }
            }
        }

        return null;
    }
}
