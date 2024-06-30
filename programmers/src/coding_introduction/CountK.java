package coding_introduction;

public class CountK {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        for (int s = i; s <= j; s++) {
            sb.append(s);
        }

        String value = sb.toString();
        int index = 0;

        for (int s = 0; s < value.length(); s++) {
            char ch = value.charAt(s);
            if (ch == (char) (k + '0')) {
                answer++;
            }
        }

        return answer;
    }
}
