package coding_LV2;

public class DivideNumberCard {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public int findGCD(int[] arr) {
        int result = arr[0];

        for (int num : arr) {
            result = gcd(result, num);
            if (result == 1) {
                break;
            }
        }

        return result;
    }

    public boolean dividesNone(int gcd, int[] arr) {
        for (int num : arr) {
            if (num % gcd == 0) {
                return false;
            }
        }

        return true;
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = findGCD(arrayA);
        int gcdB = findGCD(arrayB);

        int resultA = 0;
        if (dividesNone(gcdA, arrayB)) {
            resultA = gcdA;
        }

        int resultB = 0;
        if (dividesNone(gcdB, arrayA)) {
            resultB = gcdB;
        }

        return Math.max(resultA, resultB);
    }
}
