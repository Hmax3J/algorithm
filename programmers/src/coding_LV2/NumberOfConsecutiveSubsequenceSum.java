package coding_LV2;

import java.util.*;

public class NumberOfConsecutiveSubsequenceSum {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int n = elements.length;

        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;

                for (int i = 0; i < length; i++) {
                    sum += elements[(start + i) % n];
                }

                set.add(sum);
            }
        }

        return set.size();
    }
}
