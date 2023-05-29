import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        float half = (float) T / 2.0f;

        System.out.println((int) (half * half + 0.5));
    }
}
