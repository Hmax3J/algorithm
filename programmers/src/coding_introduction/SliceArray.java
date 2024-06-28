package coding_introduction;

import java.util.ArrayList;
import java.util.List;

public class SliceArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> list = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
