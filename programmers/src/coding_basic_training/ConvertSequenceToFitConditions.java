package coding_basic_training;

public class ConvertSequenceToFitConditions {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            boolean changed = false;
            int[] newArray = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    newArray[i] = arr[i] / 2;
                } else if (arr[i] % 2 == 1 && arr[i] < 50) {
                    newArray[i] = arr[i] * 2 + 1;
                } else {
                    newArray[i] = arr[i];
                }

                if (newArray[i] != arr[i]) {
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }

            arr = newArray;
            answer++;
        }

        return answer;
    }
}
