package brush_up.hash;

import java.util.*;

public class Ponkesmon {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), nums.length / 2);
    }
}
