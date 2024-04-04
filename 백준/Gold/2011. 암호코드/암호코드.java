import java.io.*;

public class Main {
    static int MOD = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String code = br.readLine();
        int[] dp = new int[code.length() + 1];
        dp[0] = 1; // 초기값 설정

        if (code.charAt(0) == '0') { // 암호가 0으로 시작하면 해석 불가능
            System.out.println(0);
            return;
        }

        dp[1] = 1;
        for (int i = 2; i <= code.length(); i++) {
            int oneDigit = code.charAt(i - 1) - '0';
            int twoDigits = (code.charAt(i - 2) - '0') * 10 + oneDigit;

            if (oneDigit >= 1) {
                dp[i] = (dp[i] + dp[i - 1]) % MOD;
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] = (dp[i] + dp[i - 2]) % MOD;
            }
        }

        System.out.println(dp[code.length()]);
    }
}
