package coding_LV1;

public class SplitString {
    public int solution(String s) {
        int answer = 0;
        int x = 0;
        int notX = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(index);

            if (ch == s.charAt(i)) {
                x++;
            } else {
                notX++;
            }

            if (x == notX) {
                index = i + 1;
                x = 0;
                notX = 0;
                answer++;
            }
        }

        if (index < s.length()) {
            answer++;
        }

        return answer;
    }
}
