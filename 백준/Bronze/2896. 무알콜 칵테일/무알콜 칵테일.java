import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] juice = new int[3];
        int[] ratio = new int[3];

        for (int i = 0; i < 3; i++) {
            juice[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            ratio[i] = scanner.nextInt();
        }

        double maxCocktail = Double.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            double cocktail = (double) juice[i] / ratio[i];
            maxCocktail = Math.min(maxCocktail, cocktail);
        }

        for (int i = 0; i < 3; i++) {
            double remainingJuice = juice[i] - (ratio[i] * maxCocktail);
            System.out.print(round(remainingJuice, 6) + " ");
        }
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
