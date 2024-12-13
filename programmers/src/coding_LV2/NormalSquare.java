package coding_LV2;

public class NormalSquare {
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long solution(int w, int h) {
        long gcd = gcd(w, h);

        long totalSquares = (long) w * h;
        long unusableSquares = w + h - gcd;
        return totalSquares - unusableSquares;
    }
}
