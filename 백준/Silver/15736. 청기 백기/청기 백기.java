import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i * i <= n; i++, cnt++);

        System.out.println(cnt);
    }
}