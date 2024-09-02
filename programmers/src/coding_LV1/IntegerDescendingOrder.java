package coding_LV1;

import java.util.*;

public class IntegerDescendingOrder {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.insert(0, arr[i]);
        }

        return Long.parseLong(sb.toString());
    }
}
