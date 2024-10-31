package coding_LV2;

import java.util.*;

public class NoMoreThanTwoDifferentBit {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long x = numbers[i];

            if (x % 2 == 0) {
                answer[i] = x + 1;
            } else {
                long smallestDifference = (x | (x + 1)) & ~x;
                answer[i] = x + smallestDifference / 2;
            }
        }

        return answer;
    }
}
