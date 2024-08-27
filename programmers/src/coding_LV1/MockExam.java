package coding_LV1;

import java.util.*;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int oneCount = countCorrectAnswers(answers, one);
        int twoCount = countCorrectAnswers(answers, two);
        int threeCount = countCorrectAnswers(answers, three);

        return getTopScorers(oneCount, twoCount, threeCount);
    }

    private int countCorrectAnswers(int[] answers, int[] pattern) {
        int count = 0;
        int patternLength = pattern.length;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern[i % patternLength]) {
                count++;
            }
        }

        return count;
    }

    private int[] getTopScorers(int oneCount, int twoCount, int threeCount) {
        List<Integer> list = new ArrayList<>();
        int maxCount = Math.max(oneCount, Math.max(twoCount, threeCount));

        if (oneCount == maxCount) {
            list.add(1);
        }

        if (twoCount == maxCount) {
            list.add(2);
        }

        if (threeCount == maxCount) {
            list.add(3);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
