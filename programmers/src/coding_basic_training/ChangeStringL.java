package coding_basic_training;

public class ChangeStringL {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for(char ch : myString.toCharArray()) {
            if(ch < 'l') {
                sb.append('l');
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
