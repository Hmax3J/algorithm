package coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class ArrayPowerOf2 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int length = 1;
        int[] answer = new int[] {};

        while (length < arr.length) {

            length *= 2;

        }

        for (int value : arr) {

            list.add(value);

        }

        if (length - arr.length == 0) {

            answer = list.stream().mapToInt(Integer::intValue).toArray();

        } else {

            for(int i = 0; i < length - arr.length; i++) {
                list.add(0);
            }

            answer = list.stream().mapToInt(Integer::intValue).toArray();

        }

        return answer;
    }
}
