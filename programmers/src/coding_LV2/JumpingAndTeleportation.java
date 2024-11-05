package coding_LV2;

public class JumpingAndTeleportation {
    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                ans++;
                n -= 1;
            } else {
                n /= 2;
            }
        }

        return ans;
    }
}
