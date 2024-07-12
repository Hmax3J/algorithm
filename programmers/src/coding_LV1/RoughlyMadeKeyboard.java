package coding_LV1;

public class RoughlyMadeKeyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;

            for (char charInTarget : target.toCharArray()) {
                int minPresses = Integer.MAX_VALUE;

                for (String key : keymap) {
                    int index = key.indexOf(charInTarget);
                    if (index != -1) {
                        minPresses = Math.min(minPresses, index + 1);
                    }
                }

                if (minPresses == Integer.MAX_VALUE) {
                    totalPresses = -1;
                    break;
                }
                totalPresses += minPresses;
            }

            result[i] = totalPresses;
        }

        return result;
    }
}
