import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (n == 0) {
            System.out.print("0");
            return;
        }

        String tmp = "0123456789ABCDEF";
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            str.append(tmp.charAt(n % m));
            n /= m;
        }
        System.out.print(str.reverse().toString());
    }
}
