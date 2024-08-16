package coding_LV1;

public class TritReverse {
    public int solution(int n) {
        return TritConvertDecimal(Trit(n));
    }

    public String Trit(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        sb.reverse();

        return sb.toString();
    }

    public int TritConvertDecimal(String n) {
        StringBuilder sb = new StringBuilder(n);
        String val = sb.toString();
        int answer = 0;

        for (int i = 0; i < val.length(); i++) {
            int valInteger = Integer.parseInt(val.substring(i, i + 1));
            answer += valInteger * (int) Math.pow(3, i);
        }

        return answer;
    }
}
