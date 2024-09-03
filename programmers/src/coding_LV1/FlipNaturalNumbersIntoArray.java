package coding_LV1;

import java.util.*;

public class FlipNaturalNumbersIntoArray {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();

        String[] arr = Long.toString(n).split("");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < arr.length; i++) {
            sb.insert(0, arr[i]);
        }

        for (int i = 0; i < sb.length(); i++) {
            list.add(sb.charAt(i) - '0');
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
