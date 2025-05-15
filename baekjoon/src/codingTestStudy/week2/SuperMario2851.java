package codingTestStudy.week2;

import java.util.*;

public class SuperMario2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mushroom = new int[10];

        for (int i = 0; i < mushroom.length; i++) {
            mushroom[i] = sc.nextInt();
        }

        int sum = 0;
        int countIndex = 0;

        for (int i = 0; i < mushroom.length; i++) {
            sum += mushroom[i];

            if (sum > 100) {
                countIndex = i;
                break;
            }
        }

        if (Math.abs(100 - sum) > Math.abs(100 - (sum - mushroom[countIndex]))) {
            sum -= mushroom[countIndex];
        } else if (Math.abs(100 - sum) == Math.abs(100 - (sum - mushroom[countIndex]))) {
            sum = Math.max(sum - mushroom[countIndex], sum);
        }

        System.out.println(sum);
    }
}
