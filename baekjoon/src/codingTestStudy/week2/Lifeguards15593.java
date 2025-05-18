package codingTestStudy.week2;

import java.util.*;

public class Lifeguards15593 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] shifts = new int[N][2];

        for (int i = 0; i < N; i++) {
            shifts[i][0] = sc.nextInt();
            shifts[i][1] = sc.nextInt();
        }

        int maxTime = 0;

        for (int i = 0; i < N; i++) {
            boolean[] covered = new boolean[1001];

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                int start = shifts[j][0];
                int end = shifts[j][1];
                for (int t = start; t < end; t++) {
                    covered[t] = true;
                }
            }

            int coveredTime = 0;
            for (int t = 0; t <= 1000; t++) {
                if (covered[t]) {
                    coveredTime++;
                }
            }

            maxTime = Math.max(maxTime, coveredTime);
        }

        System.out.println(maxTime);
    }
}
