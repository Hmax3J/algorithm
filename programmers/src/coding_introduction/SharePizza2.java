package coding_introduction;

public class SharePizza2 {
    public int solution(int n) {
        int answer = 1;

        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
