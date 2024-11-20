package coding_LV2;

import java.util.*;

public class MasterOfPlayingAlone {
    public int solution(int[] cards) {
        boolean[] visited = new boolean[cards.length];
        ArrayList<Integer> groupSizes = new ArrayList<>();

        for (int i = 0; i < cards.length; i++) {
            if (!visited[i]) {
                int size = 0;
                int current = i;

                while (!visited[current]) {
                    visited[current] = true;
                    current = cards[current] - 1;
                    size++;
                }
                groupSizes.add(size);
            }
        }

        Collections.sort(groupSizes, Collections.reverseOrder());

        if (groupSizes.size() < 2) {
            return 0;
        }

        return groupSizes.get(0) * groupSizes.get(1);
    }
}
