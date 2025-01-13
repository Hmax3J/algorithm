package bronzeII;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        scanner.close();

        int s1 = Integer.parseInt(input[0]);
        int s2 = Integer.parseInt(input[1]);
        int s3 = Integer.parseInt(input[2]);

        int[] sum = new int[s1 * s2 * s3];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    sum[i + j + k]++;
                }
            }
        }

        int maxIndex = 0;
        int maxValue = sum[0];

        for (int i = 1; i < sum.length; i++) {
            if (sum[i] > maxValue) {
                maxValue = sum[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
}
