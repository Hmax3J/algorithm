package coding_introduction;

import java.util.*;

public class FindTheMode {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int value : array) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int maxFrequency = Collections.max(map.values());

        int mode = -1;
        boolean multipleModes = false;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                if (mode == -1) {
                    mode = entry.getKey();
                } else {
                    multipleModes = true;
                    break;
                }
            }
        }

        return multipleModes ? -1 : mode;
    }
}
