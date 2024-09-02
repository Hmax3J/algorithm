package coding_LV1;

public class HarshadNumber {
    public boolean solution(int x) {
        String[] strX = Integer.toString(x).split("");
        int sum = 0;

        for (int i = 0; i < strX.length; i++) {
            sum += Integer.parseInt(strX[i]);
        }

        return x % sum == 0 ? true : false;
    }
}
