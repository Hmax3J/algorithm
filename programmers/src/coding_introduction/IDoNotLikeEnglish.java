package coding_introduction;

import java.util.*;

public class IDoNotLikeEnglish {
    public long solution(String numbers) {
        Map<String, String> map = new HashMap<>();
        StringBuilder mapSb = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        map = Map.of (
                "zero", "0",
                "one", "1",
                "two", "2",
                "three", "3",
                "four", "4",
                "five", "5",
                "six", "6",
                "seven", "7",
                "eight", "8",
                "nine", "9"
        );

        for (char ch : numbers.toCharArray()) {
            mapSb.append(ch);
            if (map.containsKey(mapSb.toString())) {
                answer.append(map.get(mapSb.toString()));
                mapSb.setLength(0);
            }
        }

        return Long.parseLong(answer.toString());
    }
}
