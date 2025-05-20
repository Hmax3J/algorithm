package codingTestStudy.week2;

import java.util.*;

public class WarehousePolygon2304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] heights = new int[1001];
        int left = 1001;
        int right = 0;
        int maxHeight = 0;
        int maxPos = 0;

        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            int H = sc.nextInt();
            heights[L] = H;

            if (L < left) {
                left = L;
            }

            if (L > right) {
                right = L;
            }

            if (H > maxHeight) {
                maxHeight = H;
                maxPos = L;
            }
        }

        int area = 0;

        int currMax = 0;
        for (int i = left; i <= maxPos; i++) {
            if (heights[i] > currMax) {
                currMax = heights[i];
            }

            area += currMax;
        }

        currMax = 0;
        for (int i = right; i > maxPos; i--) {
            if (heights[i] > currMax) {
                currMax = heights[i];
            }

            area += currMax;
        }

        System.out.println(area);
    }
}
