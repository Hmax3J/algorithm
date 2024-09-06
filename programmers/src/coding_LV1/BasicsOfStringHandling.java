package coding_LV1;

public class BasicsOfStringHandling {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                answer = false;
            }

        } else {
            answer = false;
        }

        return answer;
    }
}
