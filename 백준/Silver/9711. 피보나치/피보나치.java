import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int TC = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        BigInteger[] dp = new BigInteger[10001]; // P의 최댓값이 10000이기에

        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);

        for(int i = 2; i <= 10000; i++){
            dp[i] =  dp[i-2].add(dp[i-1]);
        }

        for(int tc = 1; tc <= TC; tc++){
            st = new StringTokenizer(br.readLine());

            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            
            sb.append("Case #"+tc+": "+dp[P].remainder(BigInteger.valueOf(Q))+"\n");
        }
        System.out.print(sb);
    }
}