package coding_basic_training;

public class ChangeArrayString {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for(String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}
