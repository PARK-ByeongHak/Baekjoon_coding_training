import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        while(true) {
        	double a = sc.nextDouble();
        	if(a==0) break;
        	System.out.printf("%.2f\n",1+a+a*a+a*a*a+a*a*a*a);
        }
    }
}
