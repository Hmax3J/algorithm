package coding_LV2;

import java.util.*;

public class DiscountOffer {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int answer = 0;
        int size = 10;

        for (int i = 0; i <= discount.length - size; i++) {
            HashMap<String, Integer> map = new HashMap<>(wantMap);

            for (int j = i; j < i + size; j++) {
                String product = discount[j];

                if (map.containsKey(product)) {
                    map.put(product, map.get(product) - 1);

                    if (map.get(product) == 0) {
                        map.remove(product);
                    }
                }
            }


            if (map.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
