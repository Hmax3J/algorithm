package codingTestStudy.week2;

import java.util.*;

public class CompetitionOrInternship2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int max = 0;

        for (int i = 1; i <= 100; i++) {
            int girl = i * 2;
            int boy = i;

            if (n >= girl && m >= boy) {
                int remain = (n - girl) + (m - boy);

                if (remain >= k) {
                    max++;
                }
            }
        }

        System.out.println(max);
    }
}
