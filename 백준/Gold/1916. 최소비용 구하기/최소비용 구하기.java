import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge> {
    int end, weight;

    public Edge(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}

public class Main {
    static final int INF = 100_000_000;
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dist;

    public static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Edge current = pq.poll();

            if (dist[current.end] < current.weight) {
                continue;
            }

            for (Edge next : graph.get(current.end)) {
                if (dist[next.end] > dist[current.end] + next.weight) {
                    dist[next.end] = dist[current.end] + next.weight;
                    pq.offer(new Edge(next.end, dist[next.end]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        dist = new int[n + 1];

        Arrays.fill(dist, INF);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int weight = sc.nextInt();
            graph.get(start).add(new Edge(end, weight));
        }

        int startPoint = sc.nextInt();
        int endPoint = sc.nextInt();

        dijkstra(startPoint);

        System.out.println(dist[endPoint]);
        sc.close();
    }
}
