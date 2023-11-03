import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[26];

        for (int k = 0; k < n; k++) {
            String[] s = new String[2];
            int[][] cnt = new int[2][26];

            for (int i = 0; i < 2; i++) {
                s[i] = sc.next();
                for (int j = 0; j < s[i].length(); j++) {
                    cnt[i][s[i].charAt(j) - 'a']++;
                }
            }

            for (int i = 0; i < 26; i++) {
                ans[i] += Math.max(cnt[0][i], cnt[1][i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(ans[i]);
        }
    }
}
