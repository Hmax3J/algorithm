package coding_LV2;

import java.util.*;

public class FindPrimeNumber {
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void findCombinations(String prefix, String str, Set<Integer> set) {
        int n = str.length();

        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }

        for (int i = 0; i < n; i++) {
            findCombinations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
        }
    }

    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();

        findCombinations("", numbers, set);

        int primeCount = 0;

        for (int num : set) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
