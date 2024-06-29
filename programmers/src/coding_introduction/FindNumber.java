package coding_introduction;

public class FindNumber {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        String kStr = Integer.toString(k);

        int index = numStr.indexOf(kStr);

        return index != -1 ? index + 1 : -1;
    }
}
