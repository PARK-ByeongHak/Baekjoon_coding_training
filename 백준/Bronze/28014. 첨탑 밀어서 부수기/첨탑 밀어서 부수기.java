import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int pushCount = 0;
        int t1 = 0;
        int t2;

        for (int n = 0; n < N; ++n) {
            t2 = heights[n];
            if (t1 <= t2) {
                ++pushCount;
            }
            t1 = t2;
        }

        System.out.println(pushCount);
    }
}
