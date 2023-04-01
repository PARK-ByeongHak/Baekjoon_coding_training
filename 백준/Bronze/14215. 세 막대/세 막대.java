import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b&&a>=c) {
        	if (b + c > a) System.out.println(a + b + c);
            else System.out.println((b + c) * 2 - 1);
        }else if(b>=a&&b>=c) {
        	if (a + c > b) System.out.println(a + b + c);
            else System.out.println((a + c) * 2 - 1);
        }else if(c>=b&&c>=a) {
        	if (a + b > c) System.out.println(a + b + c);
            else System.out.println((a + b) * 2 - 1);
        }
        
    }
}