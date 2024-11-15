package coding_LV2;

import java.util.*;

public class Cache {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int executionTime = 0;
        LinkedHashSet<String> cache = new LinkedHashSet<>();

        for (String city : cities) {
            String normalizedCity = city.toLowerCase();

            if (cache.contains(normalizedCity)) {
                executionTime += 1;

                cache.remove(normalizedCity);
                cache.add(normalizedCity);
            } else {
                executionTime += 5;

                if (cache.size() == cacheSize) {
                    Iterator<String> iterator = cache.iterator();
                    iterator.next();
                    iterator.remove();
                }
                cache.add(normalizedCity);
            }
        }

        return executionTime;
    }
}
