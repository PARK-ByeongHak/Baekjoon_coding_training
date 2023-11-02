import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String arr1 = scanner.next();
        String arr2 = scanner.next();
        int ans = 0;

        for (int n = 0; n < N; n++) {
            if (arr1.charAt(n) != arr2.charAt(n)) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
