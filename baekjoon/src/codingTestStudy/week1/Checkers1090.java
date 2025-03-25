package codingTestStudy.week1;

import java.util.*;

public class Checkers1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] xValues = new int[N];
        int[] yValues = new int[N];

        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            xValues[i] = sc.nextInt();
            yValues[i] = sc.nextInt();
            xSet.add(xValues[i]);
            ySet.add(yValues[i]);
        }

        List<Integer> xList = new ArrayList<>(xSet);
        List<Integer> yList = new ArrayList<>(ySet);

        List<Integer> costs = new ArrayList<>(Collections.nCopies(N, Integer.MAX_VALUE));

        for (int targetX : xList) {
            for (int targetY : yList) {
                List<Integer> moveCosts = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    int dist = Math.abs(xValues[i] - targetX) + Math.abs(yValues[i] - targetY);
                    moveCosts.add(dist);
                }

                Collections.sort(moveCosts);

                int sum = 0;
                for (int k = 0; k < N; k++) {
                    sum += moveCosts.get(k);
                    costs.set(k, Math.min(costs.get(k), sum));
                }
            }
        }

        for (int cost : costs) {
            System.out.print(cost + " ");
        }
    }
}