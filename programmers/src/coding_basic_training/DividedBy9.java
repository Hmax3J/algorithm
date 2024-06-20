package coding_basic_training;

public class DividedBy9 {
    public int solution(String number) {
        int answer = 0;

        for(int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(Character.toString(number.charAt(i)));
        }

        return answer % 9;
    }
}
