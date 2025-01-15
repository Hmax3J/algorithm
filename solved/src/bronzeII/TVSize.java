package bronzeII;

import java.util.*;

public class TVSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int D = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int W = Integer.parseInt(input[2]);

        double hwPow = Math.pow(H, 2) + Math.pow(W, 2);
        int hValue = (int) (H * (D / Math.sqrt(hwPow)));
        int wValue = (int) (W * (D / Math.sqrt(hwPow)));

        System.out.println(hValue + " " + wValue);
    }
}