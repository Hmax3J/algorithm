package coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class CreateArray5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < intStrs.length; i++) {
            result = Integer.parseInt(intStrs[i].substring(s, s + l));

            if (result > k) {
                list.add(result);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
