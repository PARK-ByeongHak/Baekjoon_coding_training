import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        long[] prefixSum = new long[N+1];
        long[] count = new long[M];
        long result = 0;

        String[] secondLine = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = (prefixSum[i-1] + Integer.parseInt(secondLine[i-1])) % M;
            count[(int)prefixSum[i]]++;
        }

        result += count[0]; // 나머지가 0인 경우, 자기 자신도 구간에 포함
        for (int i = 0; i < M; i++) {
            if (count[i] > 1) {
                result += (count[i] * (count[i] - 1)) / 2; // 조합 공식 nC2 = n*(n-1)/2
            }
        }

        System.out.println(result);
    }
}
