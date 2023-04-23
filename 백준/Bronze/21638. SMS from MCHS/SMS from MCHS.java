import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(c<0&&d>=10) {
        	System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
        }else {
        	if(a>c) {
        		System.out.println("MCHS warns! Low temperature is expected tomorrow.");
        	}else if(b<d) {
        		System.out.println("MCHS warns! Strong wind is expected tomorrow.");
        	}else {
            	System.out.println("No message");
            }
        }
    }
}
