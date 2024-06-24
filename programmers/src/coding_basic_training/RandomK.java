package coding_basic_training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomK {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[k];
        Arrays.fill(answer , -1);

        for(int value : arr) {
            if(list.indexOf(value) == -1 ) {
                list.add(value);
            }
        }

        int length = list.size() > k ? k : list.size();

        for(int i = 0; i < length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
