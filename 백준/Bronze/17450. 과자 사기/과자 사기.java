import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] snackName = {'S', 'N', 'U'};
        char ans = ' ';
        float[] efficiency = new float[3];
        float best = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            float price = scanner.nextFloat() * 10;
            float weight = scanner.nextFloat() * 10;
            if (price >= 5000) price -= 500;
            efficiency[i] = weight / price;
            best = Math.max(best, efficiency[i]);
        }
        scanner.close();

        for (int i = 0; i < 3; i++) {
            if (best == efficiency[i]) {
                ans = snackName[i];
                break;
            }
        }

        System.out.println(ans);
    }
}
