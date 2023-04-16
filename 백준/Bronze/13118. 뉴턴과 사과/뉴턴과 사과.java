import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        if(e==a) {
        	System.out.println("1");
        }else if(e==b) {
        	System.out.println("2");
        }else if(e==c) {
        	System.out.println("3");
        }else if(e==d) {
        	System.out.println("4");
        }else {
        	System.out.println("0");
        }
    }
}