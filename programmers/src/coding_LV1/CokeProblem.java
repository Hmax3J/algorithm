package coding_LV1;

public class CokeProblem {
    public int solution(int a, int b, int n) {
        int count = 0;

        while (n >= a) {
            int bottles = (n / a) * b;
            count += bottles;
            n = bottles + (n % a);
        }

        return count;
    }
}
