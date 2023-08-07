import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long P = scanner.nextLong();
        
        long result = fact(N, P);
        System.out.println(result);
    }
    
    public static long fact(long N, long P) {
        long result = 1;
 
        for (long i = 1; i <= N; i++) {
            result = result * i;
            result = result % P;
        }
 
        return result;
    }
}
