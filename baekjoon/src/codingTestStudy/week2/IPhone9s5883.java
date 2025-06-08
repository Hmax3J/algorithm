package codingTestStudy.week2;

import java.util.*;

public class IPhone9s5883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] inputs = new int[n];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
            set.add(inputs[i]);
        }

        int length = 0;

        for (Integer value : set) {
            int prev = -1;
            int count = 0;
            int max = 0;

            for (int i = 0; i < inputs.length; i++) {
                if (value == inputs[i]) {
                    continue;
                }

                if (inputs[i] == prev) {
                    count++;
                } else {
                    count = 1;
                    prev = inputs[i];
                }

                max = Math.max(max, count);
            }

            length = Math.max(length, max);
        }

        System.out.println(length);
    }
}
