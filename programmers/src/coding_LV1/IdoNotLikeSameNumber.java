package coding_LV1;

import java.util.*;

public class IdoNotLikeSameNumber {
    public int[] solution(int []arr) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (deque.peekLast() != arr[i]) {
                deque.add(arr[i]);
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
