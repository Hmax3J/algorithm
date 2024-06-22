package coding_basic_training;

public class MakeIt1 {
    public int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            int result = num_list[i];

            while (result != 1) {
                result /= 2;
                answer++;
            }
        }

        return answer;
    }
}
