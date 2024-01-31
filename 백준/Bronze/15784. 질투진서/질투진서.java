import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] X = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                X[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int jinseo = X[a - 1][b - 1];
        boolean angry = false;

        for (int j = 0; j < N; j++) {
            if (X[a - 1][j] > jinseo) {
                angry = true;
                break;
            }
        }

        for (int i = 0; i < N; i++) {
            if (X[i][b - 1] > jinseo) {
                angry = true;
                break;
            }
        }

        System.out.print(angry ? "ANGRY" : "HAPPY");

        br.close();
    }
}
