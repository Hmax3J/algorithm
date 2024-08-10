package coding_LV1;

public class FoodFightCompetition {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder("0");

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.insert(0, i);
                sb.append(i);
            }
        }

        return sb.toString();
    }
}
