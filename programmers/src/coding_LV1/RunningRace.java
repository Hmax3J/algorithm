package coding_LV1;

import java.util.*;

public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String callName : callings) {
            int idx = map.get(callName);

            String temp = players[idx - 1];
            players[idx - 1] = callName;
            players[idx] = temp;

            map.put(callName, idx - 1);
            map.put(temp, idx);
        }

        return players;
    }
}
