package coding_LV1;

import java.util.*;

public class HighestAndLowestLottoRankings {
    public int[] solution(int[] lottos, int[] win_nums) {
        int answer = 0;
        int count = 0;
        int zeroCount = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }

            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }

        answer = switch (count + zeroCount) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };

        return new int[] {answer, switch (count) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        }};
    }
}
