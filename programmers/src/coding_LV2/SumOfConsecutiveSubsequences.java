package coding_LV2;

public class SumOfConsecutiveSubsequences {
    public int[] solution(int[] sequence, int k) {
        int start = 0, end = 0, sum = 0;
        int[] answer = {-1, -1};
        int minLength = Integer.MAX_VALUE;

        while (end < sequence.length) {
            sum += sequence[end];

            while (sum > k && start <= end) {
                sum -= sequence[start];
                start++;
            }

            if (sum == k) {
                int length = end - start + 1;
                if (length < minLength) {
                    minLength = length;
                    answer = new int[] {start, end};
                }
            }

            end++;
        }

        return answer;
    }
}
