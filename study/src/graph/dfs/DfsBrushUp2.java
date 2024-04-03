package graph.dfs;

import java.util.ArrayList;

public class DfsBrushUp2 {
    private static ArrayList<Integer>[] adjList; // 인접리스트 저장할 리스트 배열 사용하겠다고 선언
    private static boolean[] visited; // 방문 여부 배열 생성
    private static ArrayList<Integer> answer; // return을 저장할 리스트 생성

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int start = 1;
        int n = 5;

        adjList = new ArrayList[n + 1]; // 리스트 배열 생성 1번부터 시작 하기 위해 + 1
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>(); // 배열 마다 리스트 초기화
        }

        for (int[] edge : graph) {
            adjList[edge[0]].add(edge[1]); // 인접 리스트 초기화
        }

        visited = new boolean[n + 1];
        answer = new ArrayList<>();
        dfs(start);
    }

    private static void dfs(int now) {
        visited[now] = true;
        answer.add(now);

        for (int next : adjList[now]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
