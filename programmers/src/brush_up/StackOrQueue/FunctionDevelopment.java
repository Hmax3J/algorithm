package brush_up.StackOrQueue;

import java.util.*;

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer((int) Math.ceil((100.0 - progresses[0]) / speeds[0]));

        for (int i = 1; i < progresses.length; i++) {
            int value = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);

            if (queue.peek() >= value) {
                queue.offer(value);
            } else {
                while (!queue.isEmpty()) {
                    list.add(queue.size());
                    queue.clear();
                }

                queue.offer(value);
            }
        }

        if (!queue.isEmpty()) {
            list.add(queue.size());
        }

        return list.stream().mapToInt(num -> num).toArray();
    }
}
