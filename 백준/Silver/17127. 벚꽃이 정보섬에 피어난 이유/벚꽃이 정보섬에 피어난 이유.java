import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] check = new boolean[n];
        int max = 0;

        for (int i = 0; i < 4; i++) {
            int data = 1;

            for (int j = i; j < n - 3 + i; j++) {
                data *= arr[j];
                check[j] = true;
            }

            for (int k = 0; k < n; k++) {
                if (!check[k]) {
                    data += arr[k];
                }
            }

            if (data > max) {
                max = data;
            }

            Arrays.fill(check, false);
        }

        System.out.println(max);
    }
}
