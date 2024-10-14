package coding_LV2;

import java.util.*;

public class RemoveInPair {
    public int solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char word = s.charAt(i);

            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
