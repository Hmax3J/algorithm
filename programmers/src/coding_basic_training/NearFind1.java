package coding_basic_training;

public class NearFind1 {
    public int solution(int[] arr, int idx) {
        int answer = 0;

        for(int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
            answer = -1;
        }

        return answer;
    }
}
