package coding_introduction;

public class AdditionOfHiddenNumbers2 {
    public int solution(String my_string) {
        String[] str = my_string.split("[a-zA-Z]");
        int answer = 0;

        for (String value : str) {
            if (!value.equals("")) {
                answer += Integer.parseInt(value);
            }
        }

        return answer;
    }
}
