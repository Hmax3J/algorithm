package coding_LV2;

import java.util.*;

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();

        Queue<Integer> daysQueue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remainingProgress = 100 - progresses[i];
            int daysRequired = (int) Math.ceil((double)remainingProgress / speeds[i]);
            daysQueue.offer(daysRequired);
        }

        while (!daysQueue.isEmpty()) {
            int firstDay = daysQueue.poll();
            int count = 1;

            while (!daysQueue.isEmpty() && daysQueue.peek() <= firstDay) {
                daysQueue.poll();
                count++;
            }

            answerList.add(count);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
