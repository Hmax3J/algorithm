package codingTestStudy.week2;

import java.util.*;

public class AssignARoom14697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        boolean possible = false;

        for (int i = 0; i <= N / A; i++) {
            for (int j = 0; j <= N / B; j++) {
                for (int k = 0; k <= N / C; k++) {
                    if (A * i + B * j + C * k == N) {
                        possible = true;
                        break;
                    }
                }

                if (possible) {
                    break;
                }
            }

            if (possible) {
                break;
            }
        }

        System.out.println(possible ? 1 : 0);
    }
}
