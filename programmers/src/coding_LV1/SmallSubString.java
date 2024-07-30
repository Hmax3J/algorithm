package coding_LV1;

import java.util.*;

public class SmallSubString {
    public int solution(String t, String p) {
        int count = 0;
        long longP = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long tString = Long.parseLong(t.substring(i, i + (p.length())));

            if (tString <= longP) {
                count++;
            }
        }

        return count;
    }
}
