package coding_LV1;

public class DetermineIntegerSquareRoot {
    public long solution(long n) {

        return Math.sqrt(n) != (int) Math.sqrt(n) ? -1 : (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
    }
}
