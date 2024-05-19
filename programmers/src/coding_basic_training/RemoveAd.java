package coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class RemoveAd {
    public String[] solution(String[] strArr) {
        List<String> arr = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                continue;
            }
            arr.add(strArr[i]);
        }

        return arr.stream().toArray(String[]::new);
    }
}
