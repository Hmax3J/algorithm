package coding_introduction;

public class AreaOfRectangle {
    public int solution(int[][] dots) {
        int maxW = Integer.MIN_VALUE;
        int minW = Integer.MAX_VALUE;
        int maxH = Integer.MIN_VALUE;
        int minH = Integer.MAX_VALUE;

        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] > maxW) {
                maxW = dots[i][0];
            }

            if (dots[i][0] < minW) {
                minW = dots[i][0];
            }

            if (dots[i][1] > maxH) {
                maxH = dots[i][1];
            }

            if (dots[i][1] < minH) {
                minH = dots[i][1];
            }
        }

        int width = maxW - minW;
        int height = maxH - minH;

        return width * height;
    }
}
