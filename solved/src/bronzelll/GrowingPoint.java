package bronzelll;

import java.util.*;

public class GrowingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> results = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            String[] parts = input.split(" ");
            int age = Integer.parseInt(parts[0]);

            int[] splittingFactors = new int[age];
            int[] prunedBranches = new int[age];

            for (int i = 0; i < age; i++) {
                splittingFactors[i] = Integer.parseInt(parts[1 + 2 * i]);
                prunedBranches[i] = Integer.parseInt(parts[2 + 2 * i]);
            }

            long leaves = 1;
            for (int i = 0; i < age; i++) {
                leaves = leaves * splittingFactors[i] - prunedBranches[i];
            }

            results.add(leaves);
        }

        scanner.close();

        for (long result : results) {
            System.out.println(result);
        }
    }
}
