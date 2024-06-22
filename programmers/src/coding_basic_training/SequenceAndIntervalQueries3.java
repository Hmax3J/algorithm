package coding_basic_training;

public class SequenceAndIntervalQueries3 {
    public int[] solution(int[] arr, int[][] queries) {

        for(int[] query : queries) {
            int startIndex = query[0];
            int endIndex = query[1];

            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }

        return arr;

    }
}
