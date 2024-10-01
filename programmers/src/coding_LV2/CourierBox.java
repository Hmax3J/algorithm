package coding_LV2;

import java.util.*;

public class CourierBox {
    public int solution(int[] order) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        int box = 1;
        int count = 0;

        while (box <= order.length) {
            if (order[index] == box) {
                count++;
                index++;
                box++;
            } else if (!stack.isEmpty() && stack.peek() == order[index]) {
                stack.pop();
                count++;
                index++;
            } else {
                stack.push(box);
                box++;
            }
        }

        while (!stack.isEmpty() && stack.peek() == order[index]) {
            stack.pop();
            count++;
            index++;
        }

        return count;
    }
}
