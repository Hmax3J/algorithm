package coding_introduction;

import java.util.ArrayList;
import java.util.List;

public class SimilarityOfArrays {
    public int solution(String[] s1, String[] s2) {
        List<String> s1Set = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (String num : s1) {
            s1Set.add(num);
        }

        for (String num : s2) {
            if (s1Set.contains(num)) {
                result.add(num);
            }
        }

        return result.size();
    }
}
