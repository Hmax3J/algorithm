package coding_LV2;

import java.util.Stack;

public class RotateParentheses {
    public static int solution(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (isValid(s, i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isValid(String s, int start) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt((start + i) % n);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
