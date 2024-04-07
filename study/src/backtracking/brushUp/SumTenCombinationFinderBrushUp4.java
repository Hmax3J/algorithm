package backtracking.brushUp;

import java.util.ArrayList;

public class SumTenCombinationFinderBrushUp4 {
    private static ArrayList<ArrayList<Integer>> result;
    private static int n;

    private static void backtrack(int sum, ArrayList<Integer> selectedNums, int start) {
        if (sum == 10) {
            result.add(selectedNums);
            return;
        }

        for (int i = start; i <= n; i++) {
            if (sum + i <= 10) {
                ArrayList<Integer> list = new ArrayList<>(selectedNums);
                list.add(i);
                backtrack(sum + i, list, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        n = 5;
        result = new ArrayList<>();
        backtrack(0, new ArrayList<>(), 1);
        System.out.println(result);
    }
}
