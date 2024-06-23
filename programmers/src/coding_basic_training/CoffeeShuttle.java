package coding_basic_training;

public class CoffeeShuttle {
    public int solution(String[] order) {
        int answer = 0;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("caf")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }
}
