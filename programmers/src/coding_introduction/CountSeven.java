package coding_introduction;

public class CountSeven {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        String value = sb.toString();


        for (int i = 0; i < sb.length(); i++) {
            char ch = value.charAt(i);
            if (ch == '7') {
                answer++;
            }
        }

        return answer;
    }
}
