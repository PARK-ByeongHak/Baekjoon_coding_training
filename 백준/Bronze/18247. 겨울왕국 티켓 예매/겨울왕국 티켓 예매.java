import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       for(int i=0; i<n; i++) {
    	   int a = sc.nextInt();
    	   int b = sc.nextInt();
    	   if(a<12||b<4) {
    		   System.out.println("-1");
    	   }else {
    		   System.out.println(11*b+4);
    	   }
       }
    }
}