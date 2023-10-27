import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int D = scanner.nextInt();
            int cnt = 0;
            
            for (int i = 0; i < N; i++) {
                int v = scanner.nextInt();
                int f = scanner.nextInt();
                int c = scanner.nextInt();
                
                if ((double) v * f / c >= D) {
                    cnt++;
                }
            }
            
            System.out.println(cnt);
        }
    }
}
