package grind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int data = target - nums[i];

            if(map.containsKey(data)) { // 맵에 data에 해당하는 키가 있는지 확인
                return new int[]{map.get(data), i}; // 있으면 data의 인덱스와 현재 인덱스로 배열 만들어서 return
            }

            map.put(nums[i], i); // if 실행 안했을 때 map에 data에 해당하는 키가 없으니 map에 입력
        }

        return new int[]{};
    }
}
