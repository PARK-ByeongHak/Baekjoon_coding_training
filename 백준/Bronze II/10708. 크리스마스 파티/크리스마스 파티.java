import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[101];
        int[] b = new int[101];
        int[] ans = new int[101];

        for (int i = 1; i <= m; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 1; i <= m; i++) {
            int target = a[i];
            int cnt = 0;

            for (int j = 1; j <= n; j++) {
                b[j] = scanner.nextInt();
            }

            for (int j = 1; j <= n; j++) {
                if (target == b[j]) {
                    ans[j]++;
                } else {
                    cnt++;
                }
            }

            // 마지막에 못 맞춘 사람들만큼 타겟은 점수를 더 얻는다.
            ans[a[i]] += cnt;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(ans[i]);
        }
    }
}
