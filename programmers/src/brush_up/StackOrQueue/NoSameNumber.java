package brush_up.StackOrQueue;

import java.util.*;

public class NoSameNumber {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
