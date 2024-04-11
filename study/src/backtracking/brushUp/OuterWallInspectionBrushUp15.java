package backtracking.brushUp;

public class OuterWallInspectionBrushUp15 {
    private static int length, answer;
    private static int[] Weak;
    private static boolean[] used;

    private static boolean check(int[] dist) {
        for (int i = 0; i < length; i++) {
            int idx = i;
            for (int distance : dist) {
                int position = Weak[idx++] + distance;
                while (idx < Weak.length && Weak[idx] <= position) {
                    idx++;
                }
            }
            if (idx - i >= length) return true;
        }
        return false;
    }
}
