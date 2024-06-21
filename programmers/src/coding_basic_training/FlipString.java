package coding_basic_training;

public class FlipString {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder reverseString = new StringBuilder(my_string.substring(s, e + 1));

        String replaceString = reverseString.reverse().toString();

        return sb.replace(s, e + 1, replaceString).toString();
    }
}
