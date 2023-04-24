import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    	int as = sc.nextInt();
        int bs = sc.nextInt();
        int cs = sc.nextInt();
        
        if(as==a&&bs==b&&cs==c) {
        	System.out.println("A");
        }else if(as*2>=a&&bs==b&&cs==c) {
        	System.out.println("B");
        }else if(bs==b&&cs==c) {
        	System.out.println("C");
        }else if(bs*2>=b&&cs==c) {
        	System.out.println("D");
        }else {
        	System.out.println("E");
        }
    }
}
