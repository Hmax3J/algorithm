package coding_introduction;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
    public String solution(String rsp) {
        Map<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        map.put('0', '5');
        map.put('2', '0');
        map.put('5', '2');

        for (int i = 0; i < rsp.length(); i++) {
            sb.append(map.get(rsp.charAt(i)));
        }

        return sb.toString();
    }
}
