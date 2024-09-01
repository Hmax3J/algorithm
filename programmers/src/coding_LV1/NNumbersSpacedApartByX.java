package coding_LV1;

public class NNumbersSpacedApartByX {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = x + answer[i - 1];
        }

        return answer;
    }
}
