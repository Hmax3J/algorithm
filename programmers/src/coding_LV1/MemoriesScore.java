package coding_LV1;

import java.util.*;

public class MemoriesScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int result = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (map.get(photo[i][j]) == null) {
                    continue;
                }
                result += map.get(photo[i][j]);
            }
            list.add(result);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
