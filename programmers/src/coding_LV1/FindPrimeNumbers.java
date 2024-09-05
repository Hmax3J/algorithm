package coding_LV1;

public class FindPrimeNumbers {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 2; i <= n; i++) {

            if (i == 2) {
                answer++;
                continue;
            }

            if (i % 2 == 0) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                answer++;
            }
        }

        return answer;
    }
}
