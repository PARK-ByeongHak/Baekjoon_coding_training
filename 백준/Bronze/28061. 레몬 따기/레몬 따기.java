import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        // xi - (N-ai) 가 최대인 걸 고른다
        int res = 0;
        for (int i = 0; i < N; i++) {
            int tmp = x[i] - (N - i);
            res = Math.max(res, tmp);
        }
        System.out.println(res);
    }
}
