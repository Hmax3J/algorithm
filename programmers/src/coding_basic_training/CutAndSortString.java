package coding_basic_training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutAndSortString {
    public String[] solution(String myString) {
        String[] splitString = myString.split("x");

        List<String> list = new ArrayList<>();
        for (String st : splitString) {
            if (!st.isEmpty()) {
                list.add(st);
            }
        }

        String[] answer = list.toArray(new String[0]);

        Arrays.sort(answer);

        return answer;
    }
}
