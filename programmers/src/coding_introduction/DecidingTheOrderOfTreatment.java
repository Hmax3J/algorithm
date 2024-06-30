package coding_introduction;

public class DecidingTheOrderOfTreatment {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] <= emergency[j]) {
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }
}
