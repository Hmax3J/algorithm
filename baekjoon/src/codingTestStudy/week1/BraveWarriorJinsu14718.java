package codingTestStudy.week1;

import java.util.*;

public class BraveWarriorJinsu14718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] stats = new int[n][3];

        for (int i = 0; i < n; i++) {
            stats[i][0] = sc.nextInt();
            stats[i][1] = sc.nextInt();
            stats[i][2] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    int str = Math.max(stats[i][0], Math.max(stats[j][0], stats[l][0]));
                    int dex = Math.max(stats[i][1], Math.max(stats[j][1], stats[l][1]));
                    int intel = Math.max(stats[i][2], Math.max(stats[j][2], stats[l][2]));

                    int cnt = 0;
                    for (int m = 0; m < n; m++) {
                        if (stats[m][0] <= str && stats[m][1] <= dex && stats[m][2] <= intel) {
                            cnt++;
                        }
                    }

                    if (cnt >= k) {
                        max = Math.min(max, str + dex + intel);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
