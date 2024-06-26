package coding_basic_training;

import java.util.Arrays;

public class DiceGame3 {
    public int solution(int a, int b, int c, int d) {
        int[] array = { a , b , c , d };
        int result = 0;

        Arrays.sort(array);

        if (array[0] == array[3]) {
            result = 1111 * array[0];

        } else if (array[0] == array[2]) {
            result = (10 * array[0] + array[3]) * (10 * array[0] + array[3]);

        } else if (array[1] == array[3]) {
            result = (10 * array[3] + array[0]) * (10 * array[3] + array[0]);

        } else if (array[0] == array[1] && array[2] == array[3]) {
            result = (array[0] + array[2]) * Math.abs(array[0] - array[2]);

        } else if (array[0] == array[1] || array[1] == array[2] || array[2] == array[3]) {

            if (array[0] == array[1]) {
                result = array[2] * array[3];
            } else if (array[1] == array[2]) {
                result = array[0] * array[3];
            } else {
                result = array[0] * array[1];
            }

        } else {
            result = array[0];
        }

        return result;
    }
}
