package coding_LV2;

import java.util.*;

public class MaximizeFormula {
    private void permute(String[] arr, int depth, List<String[]> result) {
        if (depth == arr.length) {
            result.add(arr.clone());
            return;
        }

        for (int i = depth; i < arr.length; i++) {
            swap(arr, depth, i);
            permute(arr, depth + 1, result);
            swap(arr, depth, i);
        }
    }

    private void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private long calculate(String expression, String[] priority) {
        List<Long> numbers = new ArrayList<>();
        List<String> ops = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char c : expression.toCharArray()) {
            if (c == '+' || c == '-' || c == '*') {
                numbers.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                ops.add(String.valueOf(c));
            } else {
                sb.append(c);
            }
        }

        numbers.add(Long.parseLong(sb.toString()));

        for (String op : priority) {
            for (int i = 0; i < ops.size(); ) {
                if (ops.get(i).equals(op)) {
                    long result = operate(numbers.get(i), numbers.get(i + 1), op);
                    numbers.set(i, result);
                    numbers.remove(i + 1);
                    ops.remove(i);
                } else {
                    i++;
                }
            }
        }

        return Math.abs(numbers.get(0));
    }

    private long operate(long a, long b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public long solution(String expression) {
        String[] operators = {"+", "-", "*"};
        List<String[]> permutations = new ArrayList<>();
        permute(operators, 0, permutations);

        long maxResult = 0;
        for (String[] priority : permutations) {
            maxResult = Math.max(maxResult, calculate(expression, priority));
        }

        return maxResult;
    }
}
