package coding_LV1;

import java.util.*;

public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if (min == arr[i]) {
                continue;
            }

            list.add(arr[i]);

        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
