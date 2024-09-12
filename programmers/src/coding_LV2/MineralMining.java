package coding_LV2;

import java.util.*;

public class MineralMining {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        List<int[]> fatigueList = new ArrayList<>(); // 각 구간의 피로도를 계산하여 저장
        int totalPicks = (picks[0] + picks[1] + picks[2]) * 5; // 총 곡괭이로 캘 수 있는 광물 수

        // 광물을 5개씩 나눠서 피로도 계산 (총 5개의 피로도)
        for (int i = 0; i < minerals.length && i < totalPicks; i += 5) {
            int diaFatigue = 0, ironFatigue = 0, stoneFatigue = 0; // 각 곡괭이에 대한 피로도

            for (int j = i; j < i + 5 && j < minerals.length; j++) {
                String mineral = minerals[j];

                // 다이아몬드 곡괭이
                diaFatigue += 1;

                // 철 곡괭이
                if (mineral.equals("diamond")) {
                    ironFatigue += 5;
                } else {
                    ironFatigue += 1;
                }

                // 돌 곡괭이
                if (mineral.equals("diamond")) {
                    stoneFatigue += 25;
                } else if (mineral.equals("iron")) {
                    stoneFatigue += 5;
                } else {
                    stoneFatigue += 1;
                }
            }

            fatigueList.add(new int[]{diaFatigue, ironFatigue, stoneFatigue});
        }

        // 피로도가 높은 구간부터 곡괭이 우선순위에 따라 사용
        fatigueList.sort((a, b) -> {
            int cmp = b[2] - a[2]; // 돌 곡괭이 기준으로 먼저 정렬
            if (cmp == 0) {
                cmp = b[1] - a[1]; // 그다음 철 곡괭이 기준 정렬
            }
            return cmp;
        });

        // 피로도 계산
        for (int[] fatigue : fatigueList) {
            if (picks[0] > 0) { // 다이아 곡괭이 사용
                answer += fatigue[0];
                picks[0]--;
            } else if (picks[1] > 0) { // 철 곡괭이 사용
                answer += fatigue[1];
                picks[1]--;
            } else if (picks[2] > 0) { // 돌 곡괭이 사용
                answer += fatigue[2];
                picks[2]--;
            } else {
                break; // 더 이상 사용할 곡괭이가 없으면 종료
            }
        }

        return answer;
    }
}
