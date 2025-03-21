package codingTestStudy.week1;

import java.util.*;

public class ConvenienceStoreTwo14400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();

        long[] xValues = new long[N];
        long[] yValues = new long[N];

        for (int i = 0; i < N; i++) {
            xValues[i] = sc.nextInt();
            yValues[i] = sc.nextInt();
        }

        Arrays.sort(xValues);
        Arrays.sort(yValues);

        long pointX = xValues[(N - 1) / 2];
        long pointY = yValues[(N - 1) / 2];

        long minSum = 0;

        for (int i = 0; i < N; i++) {
            minSum += Math.abs(xValues[i] - pointX);
            minSum += Math.abs(yValues[i] - pointY);
        }

        System.out.println(minSum);
    }
}
