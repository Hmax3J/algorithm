package coding_introduction;

public class LambSkewers {
    public int solution(int n, int k) {
        return n / 10 >= 1 ?
                (n * 12000) + ((k - (n / 10)) * 2000) :
                (n * 12000) + (k * 2000);
    }
}
