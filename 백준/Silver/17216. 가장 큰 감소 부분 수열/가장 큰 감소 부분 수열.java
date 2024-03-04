import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = arr[i];
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] < arr[j]) dp[i] = Math.max(dp[i], dp[j]+arr[i]);
            }
            max = Math.max(max, dp[i]);
        }
        System.out.print(max);
    }
}