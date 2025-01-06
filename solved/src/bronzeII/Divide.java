package bronzeII;

import java.util.*;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        int F = scanner.nextInt();

        scanner.close();

        long modifiedN = (N / 100) * 100;

        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((modifiedN + i) % F == 0) {
                result = i;
                break;
            }
        }

        System.out.printf("%02d\n", result);
    }
}
