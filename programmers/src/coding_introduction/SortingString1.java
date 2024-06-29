package coding_introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingString1 {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if ('0' <= ch && ch <= '9') {
                list.add(ch - '0');
            }
        }

        Collections.sort(list);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
