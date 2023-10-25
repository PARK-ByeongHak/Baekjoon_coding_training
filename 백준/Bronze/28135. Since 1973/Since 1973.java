import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int res = 0;
        for (int i = 0; i < N; i++) {
            res++;
            if (String.valueOf(i).contains("50")) {
                res++;
            }
        }
        
        System.out.println(res);
    }
}

