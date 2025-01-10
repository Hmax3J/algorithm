package bronzeII;

import java.util.*;

public class BasketballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] lastNameCount = new int[26];

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            char[] lastName = scanner.nextLine().toCharArray();

            lastNameCount[lastName[0] - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (lastNameCount[i] >= 5) {
                sb.append((char) (i + 'a'));
            }
        }

        if (sb.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb.toString());
        }
    }
}
