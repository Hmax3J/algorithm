package coding_basic_training;

public class SequenceAndIntervalQueries4 {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0 || i == 0) {
                    arr[i] += 1;
                }
            }
        }

        return arr;
    }
}
