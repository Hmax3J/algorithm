package coding_LV2;

public class CollectionDictionary {
    static int[] weight = {781, 156, 31, 6, 1};
    static char[] vowels = {'A', 'E', 'I', 'O', 'U'};

    public int solution(String word) {
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == ch) {
                    answer += j * weight[i];
                    break;
                }
            }

            answer++;
        }

        return answer;
    }
}
