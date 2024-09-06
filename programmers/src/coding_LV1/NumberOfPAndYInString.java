package coding_LV1;

public class NumberOfPAndYInString {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.toLowerCase(s.charAt(i)) == 'p') {
                pCount++;
            }

            if (Character.toLowerCase(s.charAt(i)) == 'y') {
                yCount++;
            }

        }

        if (pCount != yCount) {
            answer = false;
        } else if (pCount == 0 && yCount == 0) {
            answer = true;
        } else {
            answer = true;
        }

        return answer;
    }
}
