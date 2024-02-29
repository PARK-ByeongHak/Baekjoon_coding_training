import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 2 || n >= 4) {
            System.out.println("Woof-meow-tweet-squeek");
            return;
        }

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((a == 1 && b == 3) || (a == 3 && b == 1)) {
            } else if (a == 1 && b == 4 || (a == 4 && b == 1)) {
            } else if (a == 3 && b == 4 || (a == 4 && b == 3)) {
            } else {
                System.out.println("Woof-meow-tweet-squeek");
                return;
            }
        }

        System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
    }
}
