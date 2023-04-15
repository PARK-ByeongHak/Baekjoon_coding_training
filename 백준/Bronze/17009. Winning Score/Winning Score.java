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
        if((a*3)+(b*2)+(c)>(d*3)+(e*2)+(f)) {
        	System.out.println("A");
        }else if((a*3)+(b*2)+(c)<(d*3)+(e*2)+(f)) {
        	System.out.println("B");
        }else {
        	System.out.println("T");
        }
    }
}