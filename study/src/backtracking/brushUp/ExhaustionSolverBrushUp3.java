package backtracking.brushUp;

public class ExhaustionSolverBrushUp3 {
    private static int answer;
    private static int[][] Dungeons;
    private static boolean[] visited;

    private static void backtrack(int k, int cnt) {
        for (int i = 0; i < Dungeons.length; i++) {
            if (!visited[i] && k >= Dungeons[i][0]) {
                visited[i] = true;
                backtrack(k - Dungeons[i][1], cnt + 1);
                answer = Math.max(answer, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {
                {80, 20},
                {50, 40},
                {30, 10}
        };
        Dungeons = dungeons;
        answer = 0;
        visited = new boolean[dungeons.length];

        backtrack(k, 0);
        System.out.println(answer);
    }
}
