package codingTestStudy.week1;

import java.util.*;

public class Antenna18310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);

        System.out.println(input[(n - 1) / 2]);
    }
}