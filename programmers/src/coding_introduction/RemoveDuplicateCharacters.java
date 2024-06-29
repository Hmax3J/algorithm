package coding_introduction;

import java.util.*;

public class RemoveDuplicateCharacters {
    public String solution(String my_string) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < sb.length(); i++) {
            set.add(sb.charAt(i));
        }

        StringBuilder answer = new StringBuilder();
        for (Character ch : set) {
            answer.append(ch);
        }

        return answer.toString();
    }
}
