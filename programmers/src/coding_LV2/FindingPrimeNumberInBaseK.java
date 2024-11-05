package coding_LV2;

public class FindingPrimeNumberInBaseK {
    public int solution(int n, int k) {
        String kBaseNumber = Integer.toString(n, k);

        String[] candidates = kBaseNumber.split("0");

        int primeCount = 0;

        for (String part : candidates) {
            if (part.isEmpty()) {
                continue;
            }

            long num = Long.parseLong(part);

            if (isPrime(num)) {
                primeCount++;
            }
        }

        return primeCount;
    }

    private boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
