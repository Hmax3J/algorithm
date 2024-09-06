package coding_LV1;

import java.util.*;

public class SortStringHoweverYouWant {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;

        Arrays.sort(answer, Comparator.comparing((String s) -> s.charAt(n))
                .thenComparing(Comparator.naturalOrder()));

        return answer;
    }
}
