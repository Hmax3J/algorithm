package coding_LV2;

import java.util.*;

public class InterceptionSystem {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));

        int answer = 0;
        double lastIntercept = -1;

        for (int[] target : targets) {
            int s = target[0];
            int e = target[1];

            if (s >= lastIntercept) {
                answer++;
                lastIntercept = e - 0.5;
            }
        }

        return answer;
    }
}
