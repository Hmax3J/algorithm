package coding_LV2;

import java.util.ArrayDeque;

public class StockPrice {
    public int[] solution(int[] prices) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int length = prices.length;
        int[] answer = new int[length];

        stack.push(0);

        for (int i = 1; i < length; i++) {
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int pop = stack.pop();
                answer[pop] = i - pop;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int pop = stack.pop();
            answer[pop] = length - 1 - pop;
        }

        return answer;
    }
}
