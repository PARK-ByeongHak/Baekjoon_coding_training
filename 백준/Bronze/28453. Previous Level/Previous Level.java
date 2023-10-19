import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] levels = new int[N];
        
        for (int i = 0; i < N; i++) {
            levels[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            if (levels[i] == 300) {
                System.out.print("1");
            } else if (levels[i] >= 275) {
                System.out.print("2");
            } else if (levels[i] >= 250) {
                System.out.print("3");
            } else {
                System.out.print("4");
            }

            if (i < N - 1) {
                System.out.print(" ");
            }
        }
    }
}
