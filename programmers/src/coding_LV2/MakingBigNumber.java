package coding_LV2;

public class MakingBigNumber {
    public String solution(String number, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char current = number.charAt(i);

            while (k > 0 && result.length() > 0 && result.charAt(result.length() - 1) < current) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }

            result.append(current);
        }

        result.setLength(result.length() - k);

        return result.toString();
    }
}
