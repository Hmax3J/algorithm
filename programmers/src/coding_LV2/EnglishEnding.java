package coding_LV2;

import java.util.HashSet;
import java.util.Set;

public class EnglishEnding {
    public int[] solution(int n, String[] words) {
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String currentWord = words[i];

            if (prevWord.charAt(prevWord.length() - 1) != currentWord.charAt(0)
                    || wordSet.contains(currentWord)) {

                int player = (i % n) + 1;
                int turn = (i / n) + 1;

                return new int[]{player, turn};
            }

            wordSet.add(currentWord);
        }

        return new int[]{0, 0};
    }
}
