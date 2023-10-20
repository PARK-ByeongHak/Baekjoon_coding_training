import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            String round = "";
            
            if (N > 25 && N <= 1000) {
                round = "Round 3";
            } else if (N > 1000 && N <= 4500) {
                round = "Round 2";
            } else if (N > 4500) {
                round = "Round 1";
            } else if (N <= 25){
                round = "World Finals";
            }
            
            System.out.println("Case #" + t + ": " + round);
        }
    }
}
