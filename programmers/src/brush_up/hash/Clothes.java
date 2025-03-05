package brush_up.hash;

import java.util.*;
public class Clothes {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] item : clothes) {
            map.put(item[1], map.getOrDefault(item[1], 0) + 1);
        }

        int answer = 1;

        for (int count : map.values()) {
            answer *= (count + 1);
        }

        return answer - 1;
    }
}
