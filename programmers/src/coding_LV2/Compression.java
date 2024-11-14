package coding_LV2;

import java.util.*;

public class Compression {
    public int[] solution(String msg) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> dictionary = new HashMap<>();

        int dictIndex = 1;
        for (char c = 'A'; c <= 'Z'; c++) {
            dictionary.put(String.valueOf(c), dictIndex++);
        }

        int i = 0;
        while (i < msg.length()) {
            String w = "";
            while (i < msg.length() && dictionary.containsKey(w + msg.charAt(i))) {
                w += msg.charAt(i);
                i++;
            }

            result.add(dictionary.get(w));

            if (i < msg.length()) {
                dictionary.put(w + msg.charAt(i), dictIndex++);
            }
        }

        int[] answer = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            answer[j] = result.get(j);
        }

        return answer;
    }
}
