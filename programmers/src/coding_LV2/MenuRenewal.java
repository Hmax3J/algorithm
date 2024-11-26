package coding_LV2;

import java.util.*;

public class MenuRenewal {
    private void generateCombinations(String order, int courseSize, int start, String current, Map<String, Integer> combinationCount) {
        if (current.length() == courseSize) {
            combinationCount.put(current, combinationCount.getOrDefault(current, 0) + 1);
            return;
        }

        for (int i = start; i < order.length(); i++) {
            generateCombinations(order, courseSize, i + 1, current + order.charAt(i), combinationCount);
        }
    }

    public String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {
            char[] charArray = orders[i].toCharArray();
            Arrays.sort(charArray);
            orders[i] = String.valueOf(charArray);
        }

        for (int courseSize : course) {
            Map<String, Integer> combinationCount = new HashMap<>();

            for (String order : orders) {
                if (order.length() >= courseSize) {
                    generateCombinations(order, courseSize, 0, "", combinationCount);
                }
            }

            int maxCount = 0;
            for (int count : combinationCount.values()) {
                if (count > maxCount) {
                    maxCount = count;
                }
            }

            for (Map.Entry<String, Integer> entry : combinationCount.entrySet()) {
                if (entry.getValue() == maxCount && maxCount >= 2) {
                    result.add(entry.getKey());
                }
            }
        }

        Collections.sort(result);
        return result.toArray(new String[0]);
    }
}
