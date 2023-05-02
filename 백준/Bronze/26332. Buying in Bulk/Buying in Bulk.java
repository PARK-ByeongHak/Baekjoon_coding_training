import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 고객 수

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int p = sc.nextInt();
            int totalCost;

            if (c == 1) {
                totalCost = c * p;
            } else {
                totalCost = p + (c - 1) * (p - 2);
            }

            System.out.println(c + " " + p);
            System.out.println(totalCost);
        }
    }
}
