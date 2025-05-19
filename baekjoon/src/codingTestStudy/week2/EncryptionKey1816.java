package codingTestStudy.week2;

import java.util.*;

public class EncryptionKey1816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] sValues = new long[n];
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            sValues[i] = sc.nextLong();

            result[i] = "YES";

            for (int j = 2; j <= 1_000_000; j++) {
                if (sValues[i] % j == 0) {
                    result[i] = "NO";
                    break;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
