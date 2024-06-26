package coding_introduction;

public class SumOfConsecutiveNumbers {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;

        for(int i = 0; i < num; i++) {
            total -= i;
        }

        int x = total / num;

        for(int i = 0; i < num; i++) {
            answer[i] = x + i;
        }

        return answer;
    }
}
