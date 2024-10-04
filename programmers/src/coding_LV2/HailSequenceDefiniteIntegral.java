package coding_LV2;

import java.util.*;

public class HailSequenceDefiniteIntegral {
    private ArrayList<Integer> createCollatz(int k) {
        ArrayList<Integer> sequence = new ArrayList<>();

        sequence.add(k);

        while (k > 1) {

            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }

            sequence.add(k);
        }

        return sequence;
    }

    public double[] solution(int k, int[][] ranges) {
        ArrayList<Integer> collatz = createCollatz(k);

        double[] areas = new double[collatz.size() - 1];
        for (int i = 0; i < collatz.size() - 1; i++) {
            areas[i] = (collatz.get(i) + collatz.get(i + 1)) / 2.0;
        }

        double[] result = new double[ranges.length];
        int n = collatz.size() - 1;

        for (int i = 0; i < ranges.length; i++) {
            int a = ranges[i][0];
            int b = n + ranges[i][1];

            if (a > b) {
                result[i] = -1.0;
            } else {
                result[i] = 0.0;
                for (int j = a; j < b; j++) {
                    result[i] += areas[j];
                }
            }
        }

        return result;
    }
}
