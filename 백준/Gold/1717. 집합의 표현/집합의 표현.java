import java.io.*;
import java.util.*;

public class Main {
    static int[] parent; // 각 원소의 부모 노드를 저장할 배열

    // Find 연산
    static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    // Union 연산
    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            parent[y] = x;
        }
    }

    // 두 원소가 같은 집합에 속하는지 확인
    static boolean isSameSet(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i; // 초기에 각 원소의 부모는 자기 자신
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (command == 0) {
                union(a, b); // 합집합 연산
            } else if (command == 1) {
                // 같은 집합에 속하는지 확인하고 결과 출력
                System.out.println(isSameSet(a, b) ? "YES" : "NO");
            }
        }
    }
}
