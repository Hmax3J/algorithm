package coding_LV1;

import java.util.*;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        Queue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (pq.size() > k) {
                pq.poll();
            }

            answer[i] = pq.peek();
        }

        return answer;
    }
}
