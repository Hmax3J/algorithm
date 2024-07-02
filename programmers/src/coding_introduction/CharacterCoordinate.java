package coding_introduction;

public class CharacterCoordinate {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int width = board[0] / 2;
        int height = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up" -> {
                    if (answer[1] >= height) continue;
                    answer[1] += 1;
                }

                case "down" -> {
                    if (answer[1] <= -(height)) continue;
                    answer[1] -= 1;
                }

                case "left" -> {
                    if (answer[0] <= -(width)) continue;
                    answer[0] -= 1;
                }

                default -> {
                    if (answer[0] >= width) continue;
                    answer[0] += 1;
                }
            }
        }

        return answer;
    }
}
