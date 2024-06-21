package coding_basic_training;

public class LongestString {
    public String solution(String myString, String pat) {
        String answer = "";

        for (int i = myString.length(); i >= 0; i--) {
            String substr = myString.substring(0, i);
            if (substr.endsWith(pat)) {
                answer = substr;
                break;
            }
        }

        return answer;
    }
}
