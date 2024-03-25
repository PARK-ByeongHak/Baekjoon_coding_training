import java.util.*;
import java.io.*;

public class Main {
    // 부모 노드를 찾는 함수
    public static int find(int[] parent, int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent, parent[x]);
    }

    // 두 부모 노드를 합치는 함수
    public static void union(int[] parent, int a, int b) {
        a = find(parent, a);
        b = find(parent, b);
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    // 두 노드가 같은 부모를 가지는지 확인하는 함수
    public static boolean isSameParent(int[] parent, int a, int b) {
        a = find(parent, a);
        b = find(parent, b);
        return a == b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        int M = Integer.parseInt(br.readLine()); // 연결할 수 있는 선의 수
        int[] parent = new int[N+1]; // 부모 테이블 초기화
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        // 간선 리스트를 위한 클래스
        class Edge implements Comparable<Edge> {
            int start, end, weight;

            public Edge(int start, int end, int weight) {
                this.start = start;
                this.end = end;
                this.weight = weight;
            }

            // 가중치를 기준으로 오름차순 정렬
            public int compareTo(Edge o) {
                return this.weight - o.weight;
            }
        }

        ArrayList<Edge> edgeList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edgeList.add(new Edge(start, end, weight));
        }

        // 간선을 가중치 기준으로 정렬
        Collections.sort(edgeList);

        int sum = 0; // 최소 비용
        for (Edge e : edgeList) {
            // 사이클이 발생하지 않는 경우에만 선택
            if (!isSameParent(parent, e.start, e.end)) {
                sum += e.weight;
                union(parent, e.start, e.end);
            }
        }

        System.out.println(sum); // 최소 비용 출력
    }
}
