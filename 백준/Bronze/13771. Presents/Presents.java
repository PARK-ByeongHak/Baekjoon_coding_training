import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] a = new float[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextFloat();
        }
        Arrays.sort(a);
        System.out.printf("%.2f\n", a[1]);
    }
}
