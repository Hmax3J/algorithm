package coding_LV1;

public class ClosestSameLetter {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        char[] sArray = new char[s.length()];

        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = s.charAt(i);
            answer[i] = -1;
        }

        for (int i = sArray.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (sArray[i] == sArray[j]) {
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;
    }
}
