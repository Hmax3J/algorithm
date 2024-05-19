package coding_basic_training;

public class RemoveZero {
    public String solution(String n_str) {
        String answer = "";

        if (!n_str.startsWith("0")) {
            answer = n_str;
        } else {
            int index = 0;
            while(index < n_str.length() && n_str.charAt(index) == '0') {
                index++;
            }

            answer = n_str.substring(index);
        }

        return answer;
    }
}
