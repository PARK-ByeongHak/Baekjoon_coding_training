import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();  // 용태(A)
        int B = scanner.nextInt();  // 유진(B)

        while (true) {
            B += A;
            if (B >= 5) {
                System.out.println("yt");
                break;
            }

            A += B;
            if (A >= 5) {
                System.out.println("yj");
                break;
            }
        }

        scanner.close();
    }
}
