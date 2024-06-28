package coding_introduction;

public class UpperCaseAndLowerCase {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                sb.append(Character.toLowerCase(ch));
            } else if ('a' <= ch && ch <= 'z') {
                sb.append(Character.toUpperCase(ch));
            }
        }

        return sb.toString();
    }
}
