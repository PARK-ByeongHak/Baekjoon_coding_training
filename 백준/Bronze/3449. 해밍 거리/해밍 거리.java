import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            String a = scanner.next();
            String b = scanner.next();
            int n = a.length();

            long A = Long.parseLong(a, 2);
            long B = Long.parseLong(b, 2);

            long X = A ^ B;

            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt += ((X >> i) & 1);
            }

            System.out.println("Hamming distance is " + cnt + ".");
        }
    }
}
