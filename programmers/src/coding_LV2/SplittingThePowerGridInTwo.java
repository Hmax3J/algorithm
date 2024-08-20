package coding_LV2;

import java.util.*;

public class SplittingThePowerGridInTwo {
    private static boolean[] visited;
    private static List<Integer>[] adj;
    private static int N, answer;

    public int solution(int n, int[][] wires) {
        N = n;
        answer = n - 1;

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            adj[wire[0]].add(wire[1]);
            adj[wire[1]].add(wire[0]);
        }

        visited = new boolean[n + 1];

        dfs(1);

        return answer;
    }

    private static int dfs(int now) {
        visited[now] = true;

        int sum = 0;

        for (int next : adj[now]) {
            if (!visited[next]) {
                int cnt = dfs(next);

                answer = Math.min(answer, Math.abs(N - cnt * 2));

                sum += cnt;
                System.out.println(sum);
            }
        }

        return sum + 1;
    }
}
