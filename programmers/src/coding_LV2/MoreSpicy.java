package coding_LV2;

import java.util.*;

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int s : scoville) {
            heap.add(s);
        }

        int mixCount = 0;

        while (heap.size() > 1 && heap.peek() < K) {
            int leastSpicy = heap.poll();
            int secondLeastSpicy = heap.poll();
            int newScoville = leastSpicy + (secondLeastSpicy * 2);

            heap.add(newScoville);
            mixCount++;
        }

        if (heap.peek() < K) {
            return -1;
        }

        return mixCount;
    }
}
