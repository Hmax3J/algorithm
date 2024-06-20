package coding_basic_training;

public class ManipulatingNumbers2 {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        String answer = "";

        for(int i = 1; i < numLog.length; i++) {

            answer = switch (numLog[i] - numLog[i - 1]) {
                case 1 -> "w";
                case -1 -> "s";
                case 10 -> "d";
                default -> "a";
            };

            sb.append(answer);
        }

        return sb.toString();
    }
}
