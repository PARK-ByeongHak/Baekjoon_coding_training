import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] plannedPages = new int[N];
        int[] actualPages = new int[N];
        
        for (int i = 0; i < N; i++) {
            plannedPages[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            actualPages[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (actualPages[i] >= plannedPages[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
