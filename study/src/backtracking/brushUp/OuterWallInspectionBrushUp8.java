package backtracking.brushUp;

import java.util.Arrays;

public class OuterWallInspectionBrushUp8 {
    private static int length, answer;
    private static int[] Weak;
    private static boolean[] used;

    private static boolean check(int[] dist) {
        for (int i = 0; i < length; i++) {
            int idx = i;

            for (int distance : dist) {
                int position = Weak[idx++] + distance;
                while (idx < Weak.length && Weak[idx] <= position) {
                    idx++;
                }
            }

            if (idx - i >= length) return true;
        }

        return false;
    }

    private static void backtrack(int n, int[] dist, int[] org) {
        if (n == org.length) {
            if (check(dist)) answer = n;
            return;
        }

        for (int i = 0; i < org.length; i++) {
            if (!used[i]) {
                used[i] = true;
                dist[n] = org[i];
                backtrack(n + 1, dist, org);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 12;
        int[] weak = {1, 5, 6, 10};
        int[] dist = {1, 2, 3, 4};

        length = weak.length;
        Weak = new int[length * 2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < length; j++) {
                Weak[j + (i * length)] = weak[j] + (i * n);
            }
        }

        Arrays.sort(dist);
        answer = -1;
        used = new boolean[dist.length];

        for (int i = 0; i < dist.length; i++) {
            int[] org = new int[i];
            System.arraycopy(dist, dist.length - i, org, 0, i);
            backtrack(0, new int[i], org);
            if (answer > 0) {
                break;
            }
        }
        System.out.println(answer);
    }
}
