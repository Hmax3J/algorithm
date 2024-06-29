package coding_introduction;

import java.util.Arrays;

public class SortingString2 {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();

        char[] ch = answer.toCharArray();

        Arrays.sort(ch);

        return new String(ch);
    }
}
