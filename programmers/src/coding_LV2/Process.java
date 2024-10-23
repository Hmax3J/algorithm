package coding_LV2;

import java.util.*;

public class Process {
    public int solution(int[] priorities, int location) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[] {i, priorities[i]});
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            boolean check = false;

            for (int[] process : queue) {
                if (process[1] > arr[1]) {
                    check = true;
                    break;
                }
            }

            if (check) {
                queue.offer(arr);
            } else {
                answer++;

                if (arr[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
