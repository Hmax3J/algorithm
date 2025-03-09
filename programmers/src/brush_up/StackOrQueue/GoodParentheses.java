package brush_up.StackOrQueue;

import java.util.*;

public class GoodParentheses {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char item : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(item);
            } else if (stack.peek() == '(' && item == '(') {
                stack.push(item);
            } else if (stack.peek() == '(' && item == ')') {
                stack.pop();
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
