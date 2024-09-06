package coding_LV1;

import java.util.*;

public class StringDescendingOrder {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        return sb.reverse().toString();
    }
}
