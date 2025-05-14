package codingTestStudy.week2;

import java.util.*;

public class PerfectSquareNumber6131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= a; b++) {
                if (a * a - b * b == n) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
