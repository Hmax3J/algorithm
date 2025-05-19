package codingTestStudy.week2;

import java.util.*;

public class NumbersBaseball2503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] question = new String[n];
        int[] strike = new int[n];
        int[] ball = new int[n];

        for (int i = 0; i < n; i++) {
            question[i] = sc.next();
            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        int count = 0;

        for (int num = 123; num <= 987; num++) {
            String candidate = String.valueOf(num);

            if (candidate.charAt(0) == candidate.charAt(1) ||
                    candidate.charAt(1) == candidate.charAt(2) ||
                    candidate.charAt(0) == candidate.charAt(2) ||
                    candidate.contains("0")) {
                continue;
            }

            boolean isValid = true;

            for (int i = 0; i < n; i++) {
                String q = question[i];
                int s = 0, b = 0;

                for (int j = 0; j < 3; j++) {
                    if (candidate.charAt(j) == q.charAt(j)) {
                        s++;
                    } else if (q.contains(String.valueOf(candidate.charAt(j)))) {
                        b++;
                    }
                }

                if (s != strike[i] || b != ball[i]) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        System.out.println(count);
    }
}
