package coding_LV2;

public class PseudoCantorBitString {
    public int solution(int n, long l, long r) {
        int answer = 0;

        for (long i = l; i <= r; i++) {
            if (isOne(i - 1, n)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isOne(long index, int n) {
        while (n > 0) {
            if ((index / (long)Math.pow(5, n - 1)) == 2) {
                return false;
            }
            index %= (long)Math.pow(5, n - 1);
            n--;
        }

        return index == 0;
    }
}
