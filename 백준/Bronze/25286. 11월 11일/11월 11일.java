import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] tmp = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int y = scanner.nextInt();
            int m = scanner.nextInt();
            
            if (m == 1) {
                System.out.println((y - 1) + " " + 12 + " " + 31);
            } else {
                System.out.print(y + " " + (m - 1) + " ");
                if (m == 3 && ((y % 100 != 0 && y % 4 == 0) || y % 400 == 0)) {
                    System.out.println(29);
                } else {
                    System.out.println(tmp[m - 1]);
                }
            }
        }
    }
}
