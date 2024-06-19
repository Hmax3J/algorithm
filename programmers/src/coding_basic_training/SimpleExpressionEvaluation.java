package coding_basic_training;

public class SimpleExpressionEvaluation {
    public int solution(String binomial) {
        int answer = 0;

        String[] binomialString = binomial.split(" ");

        int a = Integer.parseInt(binomialString[0]);
        int b = Integer.parseInt(binomialString[2]);

        answer = switch (binomialString[1]) {
            case "+" -> a + b;
            case "-" -> a - b;
            default -> a * b;
        };

        return answer;
    }
}
