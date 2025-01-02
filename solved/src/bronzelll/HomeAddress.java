package bronzelll;

import java.util.*;

public class HomeAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> results = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            int totalWidth = 0;

            totalWidth += 2;

            for (char c : input.toCharArray()) {
                if (c == '1') {
                    totalWidth += 2;
                } else if (c == '0') {
                    totalWidth += 4;
                } else {
                    totalWidth += 3;
                }

                totalWidth += 1;
            }

            totalWidth -= 1;

            results.add(totalWidth);
        }

        scanner.close();

        results.stream().forEach(System.out::println);
    }
}
