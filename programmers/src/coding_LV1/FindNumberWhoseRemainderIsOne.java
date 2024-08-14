package coding_LV1;

public class FindNumberWhoseRemainderIsOne {
    public int solution(int n) {
        int answer = 0;

        for (int i = 3; i < n; i++) {
            if (n % 2 == 1) {
                answer = 2;
                break;
            }

            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
