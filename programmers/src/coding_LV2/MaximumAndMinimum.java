package coding_LV2;

import java.util.*;

public class MaximumAndMinimum {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int[] arr = new int[answer.length];

        for (int i = 0; i < answer.length; i++) {
            arr[i] = Integer.parseInt(answer[i]);
        }

        Arrays.sort(arr);

        return arr[0] + " " + arr[arr.length - 1];
    }
}
