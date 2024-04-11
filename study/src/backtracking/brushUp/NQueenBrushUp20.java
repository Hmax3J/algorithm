package backtracking.brushUp;

public class NQueenBrushUp20 {
    private static int N;
    private static boolean[] width;
    private static boolean[] dirgonal1;
    private static boolean[] dirgonal2;

    private static int getAns(int y) {
        int ans = 0;

        if (y == N) {
            ans++;
        } else {
            for (int i = 0; i < N; i++) {
                if (width[i] || dirgonal1[i + y] || dirgonal2[i - y + N]) continue;
                width[i] = dirgonal1[i + y] = dirgonal2[i - y + N] = true;
                ans += getAns(y + 1);
                width[i] = dirgonal1[i + y] = dirgonal2[i - y + N] = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        N = n;
        width = new boolean[n];
        dirgonal1 = new boolean[n * 2];
        dirgonal2 = new boolean[n * 2];
        int answer = getAns(0);
        System.out.println(answer);
    }
}
