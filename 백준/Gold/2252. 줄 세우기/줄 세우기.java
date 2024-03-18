import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학생 수
        int M = sc.nextInt(); // 비교 횟수

        // 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 진입 차수 배열 초기화
        int[] indegree = new int[N + 1];

        // 그래프 구성 및 진입 차수 계산
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            graph.get(A).add(B);
            indegree[B]++;
        }

        // 위상 정렬
        List<Integer> result = topologicalSort(graph, indegree, N);

        // 결과 출력
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> topologicalSort(List<List<Integer>> graph, int[] indegree, int N) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // 진입 차수가 0인 노드를 큐에 삽입
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int current = q.poll();
            result.add(current);

            // 현재 노드와 연결된 노드들의 진입 차수 감소
            for (int next : graph.get(current)) {
                indegree[next]--;
                // 새롭게 진입 차수가 0이 된 노드를 큐에 삽입
                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }

        return result;
    }
}
