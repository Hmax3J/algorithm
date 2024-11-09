package coding_LV2;

import java.util.*;

public class MakeTheSumOfTwoQueuesEqual {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;

        for (int num : queue1) {
            q1.offer(num);
            sum1 += num;
        }

        for (int num : queue2) {
            q2.offer(num);
            sum2 += num;
        }

        long target = (sum1 + sum2) / 2;

        if ((sum1 + sum2) % 2 != 0) {
            return -1;
        }

        int operations = 0;
        int limit = queue1.length * 3;

        while (operations <= limit) {
            if (sum1 == target) {
                return operations;
            }

            if (sum1 > target) {
                int movedValue = q1.poll();
                sum1 -= movedValue;
                sum2 += movedValue;
                q2.offer(movedValue);
            } else {
                int movedValue = q2.poll();
                sum2 -= movedValue;
                sum1 += movedValue;
                q1.offer(movedValue);
            }

            operations++;
        }

        return -1;
    }
}
