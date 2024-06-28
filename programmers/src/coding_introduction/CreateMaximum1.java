package coding_introduction;

import java.util.Arrays;

public class CreateMaximum1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
