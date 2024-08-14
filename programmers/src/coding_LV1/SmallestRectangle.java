package coding_LV1;

public class SmallestRectangle {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] arr : sizes) {
            int w = Math.max(arr[0], arr[1]);
            int h = Math.min(arr[0], arr[1]);

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth * maxHeight;
    }
}
