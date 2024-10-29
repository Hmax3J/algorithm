package coding_LV2;

public class CountriesNumberOneTwoFour {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;
            n /= 3;

            if (remainder == 0) {
                answer.append("4");
                n -= 1;
            } else if (remainder == 1) {
                answer.append("1");
            } else {
                answer.append("2");
            }
        }

        return answer.reverse().toString();
    }
}
