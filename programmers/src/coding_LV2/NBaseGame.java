package coding_LV2;

public class NBaseGame {
    public String solution(int n, int t, int m, int p) {
        StringBuilder allNumbers = new StringBuilder();
        int number = 0;

        while (allNumbers.length() < t * m) {
            allNumbers.append(Integer.toString(number++, n).toUpperCase());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t; i++) {
            result.append(allNumbers.charAt((p - 1) + i * m));
        }

        return result.toString();
    }
}
