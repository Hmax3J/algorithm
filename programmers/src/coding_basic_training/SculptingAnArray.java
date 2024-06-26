package coding_basic_training;

import java.util.Arrays;

public class SculptingAnArray {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        for (int i = 0; i < query.length; i++) {
            int index = query[i];
            if (i % 2 == 0) {
                end = start + index + 1;
            } else {
                start += index;
            }
        }

        return Arrays.copyOfRange(arr, start, end);
    }
}
