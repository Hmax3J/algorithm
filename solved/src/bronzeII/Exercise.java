package bronzeII;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int m = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();
        int R = scanner.nextInt();

        int currentPulse = m;
        int totalMinutes = 0;
        int exerciseMinutes = 0;

        if (m + T > M) {
            System.out.println(-1);
            return;
        }

        while (exerciseMinutes < N) {
            if (currentPulse + T <= M) {
                currentPulse += T;
                exerciseMinutes++;
            } else {
                currentPulse -= R;
                if (currentPulse < m) {
                    currentPulse = m;
                }
            }
            totalMinutes++;
        }

        System.out.println(totalMinutes);
    }
}