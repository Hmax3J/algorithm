package coding_introduction;

import java.util.Arrays;

public class ConditionsForCompletingATriangle2 {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        int a = sides[0];
        int b = sides[1];

        int minC = Math.max(1, Math.abs(a - b) + 1);
        int maxC = a + b - 1;

        return maxC - minC + 1;
    }
}
