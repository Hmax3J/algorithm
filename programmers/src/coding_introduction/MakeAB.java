package coding_introduction;

import java.util.Arrays;

public class MakeAB {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beArr = before.toCharArray();
        char[] afArr = after.toCharArray();

        Arrays.sort(beArr);
        Arrays.sort(afArr);

        return Arrays.equals(beArr, afArr) ? 1 : 0;
    }
}
