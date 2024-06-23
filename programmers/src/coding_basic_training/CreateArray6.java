package coding_basic_training;

import java.util.Stack;

public class CreateArray6 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty() ? new int[] {-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
