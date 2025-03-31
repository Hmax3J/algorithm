package codingTestStudy.week2;

import java.util.*;

public class SevenDwarfs2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            n[i] = sc.nextInt();
            sum += n[i];
        }

        Arrays.sort(n);

        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (n[i] + n[j]) == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(n[k]);
                        }
                    }
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
    }
}
