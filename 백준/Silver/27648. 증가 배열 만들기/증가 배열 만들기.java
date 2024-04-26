import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);
        int K = Integer.parseInt(tokens[2]);

        if (N + M - 1 > K) {
            bw.write("NO\n");
        } else {
            bw.write("YES\n");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    bw.write((i + j + 1) + " ");
                }
                bw.write("\n");
            }
        }
        bw.flush(); // 버퍼에 남아있는 데이터를 모두 출력
        bw.close(); // BufferedWriter를 닫아 리소스를 해제
        br.close(); // BufferedReader를 닫아 리소스를 해제
    }
}
