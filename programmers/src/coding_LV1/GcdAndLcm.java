package coding_LV1;

import java.util.*;

public class GcdAndLcm {
    public int[] solution(int n, int m) {
        List<Integer> nVal = new ArrayList<>();
        List<Integer> mVal = new ArrayList<>();

        int max = 0;
        int min = 0;

        for (int i = 1; i <= Math.max(n, m); i++) {
            if (n % i == 0) {
                nVal.add(i);
            }

            if (m % i == 0) {
                mVal.add(i);
            }
        }

        nVal.retainAll(mVal);

        max = nVal.get(nVal.size() - 1);

        min = (n * m) / max;

        return new int[] {max, min};
    }
}
