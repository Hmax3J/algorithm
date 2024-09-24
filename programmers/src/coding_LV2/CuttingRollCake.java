package coding_LV2;

import java.util.*;

public class CuttingRollCake {
    public int solution(int[] topping) {
        int answer = 0;

        int[] rightUniqueCounts = new int[topping.length];
        Set<Integer> rightSet = new HashSet<>();

        for (int i = topping.length - 1; i >= 0; i--) {
            rightSet.add(topping[i]);
            rightUniqueCounts[i] = rightSet.size();
        }

        Set<Integer> leftSet = new HashSet<>();

        for (int i = 0; i < topping.length - 1; i++) {
            leftSet.add(topping[i]);
            if (leftSet.size() == rightUniqueCounts[i + 1]) {
                answer++;
            }
        }

        return answer;
    }
}
