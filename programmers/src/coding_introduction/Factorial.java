package coding_introduction;

public class Factorial {
    public int solution(int n) {
        int fac = 1;
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            fac *= i;
            if (fac <= n) {
                answer = i;
            }
        }

        return answer;
    }
}
