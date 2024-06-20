package coding_basic_training;

import java.util.HashSet;
import java.util.Set;

public class DiceGame2 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        int setSize = set.size();

        if (setSize == 3) {
            answer = a + b + c;
        } else if (setSize == 2) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (setSize == 1) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }

        return answer;
    }
}
