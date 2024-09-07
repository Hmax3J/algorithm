package coding_LV1;

import java.util.*;

public class ArrayOfNumbersThatFallApart {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
                count++;
            }

        }

        if (count == 0) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
