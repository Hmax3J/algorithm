package bronzelll;

import java.util.*;

public class CellPhoneBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] callTimes = new int[N];
        for (int i = 0; i < N; i++) {
            callTimes[i] = scanner.nextInt();
        }

        int yTotal = 0;
        int mTotal = 0;

        for (int time : callTimes) {
            yTotal += (time / 30 + 1) * 10;
            mTotal += (time / 60 + 1) * 15;
        }

        if (yTotal < mTotal) {
            System.out.println("Y " + yTotal);
        } else if (mTotal < yTotal) {
            System.out.println("M " + mTotal);
        } else {
            System.out.println("Y M " + yTotal);
        }

        scanner.close();
    }
}
