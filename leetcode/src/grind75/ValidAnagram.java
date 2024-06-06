package grind75;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // O(n)
        Map<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        } // 누적 합

        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);

            if (map.get(ch) < 0) {
                return false;
            } // 0보다 작으면 애너그램이 아니라 종료
        } // 누적 합에서 동일한 key 나올 때 value 에서 값 차감

        for(int value : map.values()) {
            if(value != 0) {
                return false;
            }
        }

        return true;
        /* O(n log n)
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
         */
    }
}
