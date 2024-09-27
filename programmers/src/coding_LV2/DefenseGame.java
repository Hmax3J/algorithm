package coding_LV2;

import java.util.*;

public class DefenseGame {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < enemy.length; i++) {
            pq.offer(enemy[i]);
            n -= enemy[i];

            if (n < 0) {
                if (k > 0 && !pq.isEmpty()) {
                    n += pq.poll();
                    k--;
                } else {
                    return i;
                }
            }

        }

        return enemy.length;
    }
}
