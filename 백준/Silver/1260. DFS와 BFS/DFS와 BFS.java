import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int V = sc.nextInt(); // 시작 정점 번호

        // 그래프 초기화
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph[from].add(to);
            graph[to].add(from);
        }

        // DFS와 BFS 탐색 결과 저장
        ArrayList<Integer> dfsResult = new ArrayList<>();
        ArrayList<Integer> bfsResult = new ArrayList<>();

        // DFS 탐색
        boolean[] visited = new boolean[N + 1];
        dfs(V, graph, visited, dfsResult);

        // BFS 탐색
        visited = new boolean[N + 1];
        bfs(V, graph, visited, bfsResult);

        // 결과 출력
        for (int vertex : dfsResult) {
            System.out.print(vertex + " ");
        }
        System.out.println();
        for (int vertex : bfsResult) {
            System.out.print(vertex + " ");
        }
    }

    // 깊이 우선 탐색 (DFS) 구현
    public static void dfs(int v, ArrayList<Integer>[] graph, boolean[] visited, ArrayList<Integer> result) {
        visited[v] = true;
        result.add(v);
        Collections.sort(graph[v]); // 작은 정점부터 방문하기 위해 정렬

        for (int neighbor : graph[v]) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, result);
            }
        }
    }

    // 너비 우선 탐색 (BFS) 구현
    public static void bfs(int start, ArrayList<Integer>[] graph, boolean[] visited, ArrayList<Integer> result) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);
            Collections.sort(graph[current]); // 작은 정점부터 방문하기 위해 정렬

            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
