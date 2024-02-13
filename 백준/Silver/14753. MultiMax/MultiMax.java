import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] v = new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(input[i]);
            v[i] = temp;
        }

        Arrays.sort(v);

        System.out.println(maxProduct(v));
    }

    static int maxProduct(int[] v) {
        int case1 = v[0] * v[v.length - 1];
        int case2 = v[v.length - 1] * v[v.length - 2];
        int case3 = v[0] * v[1];
        int case4 = v[v.length - 1] * v[v.length - 2] * v[v.length - 3];
        int case5 = v[0] * v[1] * v[2];
        int case6 = v[0] * v[v.length - 1] * v[v.length - 2];
        int case7 = v[0] * v[1] * v[v.length - 1];

        return Math.max(Math.max(Math.max(case1, case2), Math.max(case3, case4)),
                Math.max(Math.max(case5, case6), case7));
    }
}
