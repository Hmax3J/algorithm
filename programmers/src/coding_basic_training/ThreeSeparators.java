package coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class ThreeSeparators {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (char ch : myStr.toCharArray()) {
            if (ch != 'a' && ch != 'b' && ch != 'c') {
                sb.append(ch);
                continue;
            }

            if (sb.length() > 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        return list.isEmpty() ? new String[] {"EMPTY"} : list.toArray(String[]::new);
    }
}
