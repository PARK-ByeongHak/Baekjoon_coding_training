import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] slices = new int[8];
        
        for (int i = 0; i < 8; i++) {
            slices[i] = scanner.nextInt();
        }

        int maxMushrooms = 0;
        for (int i = 0; i < 8; i++) {
            int totalMushrooms = 0;
            for (int j = 0; j < 4; j++) {
                totalMushrooms += slices[(i + j) % 8];
            }
            maxMushrooms = Math.max(maxMushrooms, totalMushrooms);
        }

        System.out.println(maxMushrooms);
    }
}

