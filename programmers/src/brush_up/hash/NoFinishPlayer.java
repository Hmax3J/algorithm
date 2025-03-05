package brush_up.hash;

import java.util.*;

public class NoFinishPlayer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        String answer = "";

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        for (String name : participant) {
            if (map.get(name) > 0) {
                answer = name;
                break;
            }
        }

        return answer;
    }
}
