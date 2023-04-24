import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
        	int user = sc.nextInt();
        	int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>=11&&b>=8&&c>=12&&a+b+c>=55) {
            	System.out.println(user+" "+(a+b+c)+" PASS");
            }else {
            	System.out.println(user+" "+(a+b+c)+" FAIL");
            }
        }
    }
}
