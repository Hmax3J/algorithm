package grind75;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacks {
    class MyQueue {
        private Deque<Integer> in_stk = new ArrayDeque<>();
        private Deque<Integer> out_stk = new ArrayDeque<>();
        public void push(int x) {
            in_stk.push(x);
        }
        public int pop() {
            peek();
            return out_stk.pop();
        }
        public int peek() {
            if (out_stk.isEmpty())
                while (!in_stk.isEmpty())
                    out_stk.push(in_stk.pop());
            return out_stk.peek();
        }
        public boolean empty() {
            return in_stk.isEmpty() && out_stk.isEmpty();
        }
    }
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
