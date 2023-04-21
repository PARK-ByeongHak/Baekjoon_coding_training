import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();
        long f = sc.nextLong();
        long g = sc.nextLong();
        
        long heavy = e*f*g;
        long K = a*b;
        long L = c*d;
        long total = heavy * (K+L);
        
        System.out.println(total);
	}
}