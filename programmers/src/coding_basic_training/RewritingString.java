package coding_basic_training;

public class RewritingString {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();

        String start = my_string.substring(0, s);
        String end = my_string.substring(s + overwrite_string.length());

        sb.append(start);
        sb.append(overwrite_string);
        sb.append(end);

        return sb.toString();
    }
}
