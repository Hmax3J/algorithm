package bronzelll;

import java.util.*;

public class Sign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder();

        for (int t = 0; t < 3; t++) {
            int N = scanner.nextInt();
            long sum = 0;

            for (int i = 0; i < N; i++) {
                sum += scanner.nextLong();
            }

            if (sum > 0) {
                result.append("+\n");
            } else if (sum < 0) {
                result.append("-\n");
            } else {
                result.append("0\n");
            }
        }

        System.out.print(result);

        scanner.close();
    }
}
