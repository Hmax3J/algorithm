package codingTestStudy.week2;

import java.util.*;

public class Farm16283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int count = 0;
        int sheep = 0, goat = 0;

        for (int i = 1; i < n; i++) {
            int bcount = n - i;

            if ((i * a) + (b * bcount) == w) {
                count++;
                sheep = i;
                goat = bcount;
            }
        }

        if (count == 1) {
            System.out.println(sheep + " " + goat);
        } else {
            System.out.println(-1);
        }
    }
}
