package coding_introduction;

public class FindCompositeNumbers {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            boolean isComposite = false;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isComposite = true;
                    break;
                }
            }

            if (isComposite) {
                answer++;
            }
        }

        return answer;
    }
}
