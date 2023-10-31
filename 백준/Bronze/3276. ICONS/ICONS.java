import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;

        while (a * b < n) {
            if (a > b) {
                b++;
            } else {
                a++;
            }
        }

        System.out.println(a + " " + b);
    }
}
