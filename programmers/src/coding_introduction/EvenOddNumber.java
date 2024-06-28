package coding_introduction;

public class EvenOddNumber {
    public int[] solution(int[] num_list) {
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                count++;
            }
        }

        return new int[] { count, num_list.length - count };
    }
}
