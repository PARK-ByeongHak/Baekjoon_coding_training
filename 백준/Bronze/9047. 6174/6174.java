import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int ans = 0;
            String S = scanner.next();

            while (!S.equals("6174")) {
                char[] charArray = S.toCharArray();
                Arrays.sort(charArray);

                int sSmaller = Integer.parseInt(new String(charArray));
                int sBigger = Integer.parseInt(new StringBuilder(new String(charArray)).reverse().toString());
                S = Integer.toString(sBigger - sSmaller);

                while (S.length() < 4) {
                    S = "0" + S;
                }

                ans++;
            }

            System.out.println(ans);
        }

        scanner.close();
    }
}
