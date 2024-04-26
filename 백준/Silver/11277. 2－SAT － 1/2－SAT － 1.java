import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[][] clauses = new int[M][2];
        for (int i = 0; i < M; i++) {
            String[] clause = br.readLine().split(" ");
            clauses[i][0] = Integer.parseInt(clause[0]);
            clauses[i][1] = Integer.parseInt(clause[1]);
        }

        if (isSatisfiable(N, clauses)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean isSatisfiable(int N, int[][] clauses) {
        // 각 변수에 대해 두 가지 경우를 고려합니다: true 또는 false.
        for (int i = 0; i < (1 << N); i++) {
            boolean[] values = new boolean[N + 1];
            for (int j = 1; j <= N; j++) {
                values[j] = (i & (1 << (j - 1))) != 0;
            }

            boolean satisfied = true;
            for (int[] clause : clauses) {
                boolean clauseValue = false;
                for (int var : clause) {
                    if (var < 0) {
                        clauseValue |= !values[-var];
                    } else {
                        clauseValue |= values[var];
                    }
                }
                if (!clauseValue) {
                    satisfied = false;
                    break;
                }
            }

            if (satisfied) {
                return true;
            }
        }
        return false;
    }
}
