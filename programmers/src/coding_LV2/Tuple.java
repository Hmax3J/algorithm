package coding_LV2;

import java.util.*;

public class Tuple {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2).replace("},{", "-");

        String[] sets = s.split("-");

        Arrays.sort(sets, Comparator.comparingInt(String::length));

        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (String set : sets) {
            for (String numStr : set.split(",")) {
                int num = Integer.parseInt(numStr);
                if (seen.add(num)) {
                    result.add(num);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
