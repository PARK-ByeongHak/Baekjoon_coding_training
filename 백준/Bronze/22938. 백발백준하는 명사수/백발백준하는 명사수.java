import java.util.Scanner;

public class Main {
    private void solution() {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        
        if ((long)(x - x1) * (x - x1) + (long)(y - y1) * (y - y1) < (long)(r + r1) * (r + r1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }
}