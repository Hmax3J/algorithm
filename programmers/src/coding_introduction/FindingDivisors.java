package coding_introduction;

import java.util.ArrayList;
import java.util.List;

public class FindingDivisors {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    /*
    public int[] solution(int n) {
        int[] answer = new int[n];

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        answer = new int[cnt];

        cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }

        return answer;
    } 다른 사람이 한 알고리즘. 0.02ms ~ 0.5ms
     */
}
