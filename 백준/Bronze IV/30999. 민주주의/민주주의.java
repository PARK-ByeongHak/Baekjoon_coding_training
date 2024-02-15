import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        M = (M / 2) + 1;

        int proCnt = 0;

        for (int i = 0; i < N; i++) {
            String result = scanner.next();

            int cnt = 0;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == 'O') {
                    cnt++;
                }
            }

            if (M <= cnt) {
                proCnt++;
            }
        }

        System.out.println(proCnt);
    }
}
