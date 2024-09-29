package coding_LV2;

public class Dot {
    public long solution(int k, int d) {
        long answer = 0;

        for (int a = 0; a * k <= d; a++) {
            long x = (long) a * k;

            long maxY = (long) Math.sqrt((long) d * d - x * x);

            answer += maxY / k + 1;
        }

        return answer;
    }
}
