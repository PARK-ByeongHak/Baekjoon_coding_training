import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        if(a!=max&&a!=min) {
        	System.out.println(a);
        }if(b!=max&&b!=min) {
        	System.out.println(b);
        }if(c!=max&&c!=min) {
        	System.out.println(c);
        }
    }
}