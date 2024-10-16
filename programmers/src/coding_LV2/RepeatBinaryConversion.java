package coding_LV2;

public class RepeatBinaryConversion {
    public int[] solution(String s) {
        int changeCount = 0;
        int delZeroCount = 0;

        while (!s.equals("1")) {
            int originLen = s.length();

            s = s.replaceAll("0", "");

            int changeLen = s.length();

            delZeroCount += (originLen - changeLen);

            s = Integer.toBinaryString(changeLen);

            changeCount++;
        }

        return new int[] {changeCount, delZeroCount};
    }
}
