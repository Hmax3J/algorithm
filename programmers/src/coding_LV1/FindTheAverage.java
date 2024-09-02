package coding_LV1;

public class FindTheAverage {
    public double solution(int[] arr) {
        int sum = 0;

        for (int val : arr) {
            sum += val;
        }

        return sum / (double) arr.length;
    }
}
