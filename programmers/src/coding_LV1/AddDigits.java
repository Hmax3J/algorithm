package coding_LV1;

public class AddDigits {
    public int solution(int n) {
        String[] arr = Integer.toString(n).split("");

        int sum = 0;

        for (String val : arr) {
            int num = Integer.parseInt(val);

            sum += num;
        }

        return sum;
    }
}
