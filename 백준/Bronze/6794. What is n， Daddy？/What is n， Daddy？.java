import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[6];

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i + j == n) {
                    check[i] = true;
                }
            }
        }

        for (int i = 0; i <= n / 2; i++) {
            if (check[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
