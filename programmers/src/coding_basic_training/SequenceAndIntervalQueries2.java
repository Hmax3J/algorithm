package coding_basic_training;

public class SequenceAndIntervalQueries2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int min = Integer.MAX_VALUE;
            boolean found = false;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    found = true;
                }
            }

            if (!found) {
                min = -1;
            }

            answer[index++] = min;
        }

        return answer;
    }
}
