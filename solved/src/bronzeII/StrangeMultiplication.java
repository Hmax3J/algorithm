package bronzeII;

import java.util.*;

public class StrangeMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputSlice = input.split(" ");

        String a = inputSlice[0];
        String b = inputSlice[1];

        int result = 0;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                result += (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }

        System.out.println(result);
    }
}
