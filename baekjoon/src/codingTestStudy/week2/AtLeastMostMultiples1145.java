package codingTestStudy.week2;

import java.util.*;

public class AtLeastMostMultiples1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int result = 1;

        while (true) {
            int count = 0;

            for (int i = 0; i < 5; i++) {
                if (result % numbers[i] == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.println(result);
                break;
            }

            result++;
        }
    }
}
