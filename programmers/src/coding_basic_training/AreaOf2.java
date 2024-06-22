package coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class AreaOf2 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            return new int[] {-1};
        }

        int start = list.get(0);
        int end = list.get(list.size() - 1);

        int[] answer = new int[end - start + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i + start];
        }

        return answer;
    }
}
