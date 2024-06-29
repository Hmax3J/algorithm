package coding_introduction;

public class RotatingAnArray {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            answer = rightSwap(numbers);
        } else {
            answer = leftSwap(numbers);
        }

        return answer;
    }

    private int[] rightSwap(int[] numbers) {
        int[] answer = new int[numbers.length];

        answer[0] = numbers[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            answer[i] = numbers[i - 1];
        }

        return answer;
    }

    private int[] leftSwap(int[] numbers) {
        int[] answer = new int[numbers.length];

        answer[answer.length - 1] = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            answer[i] = numbers[i + 1];
        }

        return answer;
    }
}
