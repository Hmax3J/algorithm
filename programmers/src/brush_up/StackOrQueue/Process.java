package brush_up.StackOrQueue;

import java.util.*;

public class Process {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Deque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[] {i, priorities[i]});
            pq.offer(priorities[i]);
        }

        int order = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int index = current[0];
            int priority = current[1];

            if (priority == pq.peek()) {
                pq.poll();
                order++;

                if (index == location) {
                    return order;
                }
            } else {
                queue.offer(current);
            }
        }

        return order;
    }
}
