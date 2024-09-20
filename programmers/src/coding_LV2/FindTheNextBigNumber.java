package coding_LV2;

import java.util.*;

public class FindTheNextBigNumber {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < answer.length; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }
}
