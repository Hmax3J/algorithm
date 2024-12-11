package coding_LV2;

import java.util.*;

public class RankSearch {
    private int binarySearch(List<Integer> scores, int target) {
        int left = 0;
        int right = scores.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (scores.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return scores.size() - left;
    }

    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (String person : info) {
            String[] split = person.split(" ");
            String language = split[0];
            String job = split[1];
            String career = split[2];
            String food = split[3];
            int score = Integer.parseInt(split[4]);

            for (String lang : new String[]{language, "-"}) {
                for (String j : new String[]{job, "-"}) {
                    for (String c : new String[]{career, "-"}) {
                        for (String f : new String[]{food, "-"}) {
                            String key = lang + " " + j + " " + c + " " + f;
                            map.putIfAbsent(key, new ArrayList<>());
                            map.get(key).add(score);
                        }
                    }
                }
            }
        }

        for (List<Integer> scores : map.values()) {
            Collections.sort(scores);
        }

        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            String q = query[i].replace(" and ", " ");
            String[] qSplit = q.split(" ");
            String qLang = qSplit[0];
            String qJob = qSplit[1];
            String qCareer = qSplit[2];
            String qFood = qSplit[3];
            int qScore = Integer.parseInt(qSplit[4]);

            String key = qLang + " " + qJob + " " + qCareer + " " + qFood;
            if (map.containsKey(key)) {
                List<Integer> scores = map.get(key);
                int count = binarySearch(scores, qScore);
                result[i] = count;
            } else {
                result[i] = 0;
            }
        }

        return result;
    }
}
