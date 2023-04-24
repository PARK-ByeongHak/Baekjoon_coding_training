import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i % 6 == 0 || i == n) {
                System.out.print("Go!");
                if (i != n) {
                    System.out.print(" ");
                }
            }
        }
    }
}