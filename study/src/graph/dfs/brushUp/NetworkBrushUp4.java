package graph.dfs;

public class NetworkBrushUp4 {
    private static int[][] computer;
    private static boolean[] visited;

    private static void dfs(int now) {
        if (visited[now]) {
            return;
        }
        visited[now] = true;
        for (int i = 0; i < computer[now].length; i++) {
            if (computer[now][i] == 1) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        computer = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int answer = 0;
        int n = 3;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
}
