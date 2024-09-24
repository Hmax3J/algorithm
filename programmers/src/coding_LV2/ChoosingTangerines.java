package coding_LV2;

import java.util.*;

public class ChoosingTangerines {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int total = 0;
        int answer = 0;

        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(countMap.values());

        frequencies.sort((a, b) -> b - a);

        for (int freq : frequencies) {
            total += freq;
            answer++;

            if (total >= k) {
                break;
            }
        }

        return answer;
    }
}
