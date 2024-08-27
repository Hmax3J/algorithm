package coding_LV1;

import java.util.*;

public class GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int[] realLost = Arrays.stream(lost)
                .filter(l -> Arrays.stream(reserve).noneMatch(r -> r == l))
                .toArray();

        int[] realReserve = Arrays.stream(reserve)
                .filter(r -> Arrays.stream(lost).noneMatch(l -> l == r))
                .toArray();

        int count = n - realLost.length;


        for (int i = 0; i < realReserve.length; i++) {
            for (int j = 0; j < realLost.length; j++) {
                if (realReserve[i] - 1 == realLost[j] || realReserve[i] + 1 == realLost[j]) {
                    count++;
                    realLost[j] = -1;
                    break;
                }
            }
        }

        return count;
    }
}
