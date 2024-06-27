package coding_introduction;

import java.util.ArrayList;
import java.util.List;

public class IDoNotLikeEvenNumbers {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) {
            list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
