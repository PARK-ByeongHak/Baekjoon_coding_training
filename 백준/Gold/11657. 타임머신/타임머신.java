import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int start, end, time;

        public Edge(int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        long[] dist = new long[N + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[1] = 0; // 시작 도시의 거리는 0
        ArrayList<Edge> edges = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int A = Integer.parseInt(line[0]);
            int B = Integer.parseInt(line[1]);
            int C = Integer.parseInt(line[2]);
            edges.add(new Edge(A, B, C));
        }

        boolean negativeCycle = false;
        for (int i = 1; i <= N; i++) {
            for (Edge edge : edges) {
                if (dist[edge.start] != Long.MAX_VALUE && dist[edge.end] > dist[edge.start] + edge.time) {
                    dist[edge.end] = dist[edge.start] + edge.time;
                    if (i == N) { // N번째 라운드에서도 값이 갱신된다면 음수 사이클 존재
                        negativeCycle = true;
                    }
                }
            }
        }

        if (negativeCycle) {
            System.out.println(-1);
        } else {
            for (int i = 2; i <= N; i++) {
                if (dist[i] == Long.MAX_VALUE) {
                    System.out.println(-1);
                } else {
                    System.out.println(dist[i]);
                }
            }
        }
    }
}
