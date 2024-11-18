package coding_LV2;

import java.util.*;

public class NewsClustering {
    private static List<String> createMultiset(String str) {
        List<String> multiset = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            if (Character.isLetter(first) && Character.isLetter(second)) {
                multiset.add("" + first + second);
            }
        }
        return multiset;
    }

    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> multiset1 = createMultiset(str1);
        List<String> multiset2 = createMultiset(str2);

        Map<String, Integer> countMap1 = new HashMap<>();
        Map<String, Integer> countMap2 = new HashMap<>();

        for (String element : multiset1) {
            countMap1.put(element, countMap1.getOrDefault(element, 0) + 1);
        }
        for (String element : multiset2) {
            countMap2.put(element, countMap2.getOrDefault(element, 0) + 1);
        }

        int intersectionSize = 0;
        int unionSize = 0;

        Set<String> allElements = new HashSet<>();
        allElements.addAll(countMap1.keySet());
        allElements.addAll(countMap2.keySet());

        for (String element : allElements) {
            int count1 = countMap1.getOrDefault(element, 0);
            int count2 = countMap2.getOrDefault(element, 0);
            intersectionSize += Math.min(count1, count2);
            unionSize += Math.max(count1, count2);
        }

        double jaccard = unionSize == 0 ? 1.0 : (double) intersectionSize / unionSize;

        return (int) (jaccard * 65536);
    }
}
