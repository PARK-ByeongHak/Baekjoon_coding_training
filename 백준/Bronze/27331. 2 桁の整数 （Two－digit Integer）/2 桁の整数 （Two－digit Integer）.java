import java.util.Scanner;

public class Main {
    public static String twoDigitInteger(int A, int B) {
        return Integer.toString(A) + Integer.toString(B);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(twoDigitInteger(A, B));
    }
}
