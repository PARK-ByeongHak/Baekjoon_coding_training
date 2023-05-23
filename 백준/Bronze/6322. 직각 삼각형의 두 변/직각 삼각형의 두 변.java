import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        while(true) {
        	double a = sc.nextDouble();
        	double b = sc.nextDouble();
        	double c = sc.nextDouble();
        	cnt++;
        	if(a==0&&b==0&&c==0) {
        		break;
        	}
        	
        	if(a==-1) {
        		a = Math.sqrt(c*c-b*b);
        		if(a>0) {
        			System.out.println("Triangle #"+cnt);
        			System.out.printf("a = %.3f\n",a);
        			System.out.println();
        		}else {
        			System.out.println("Triangle #"+cnt);
        			System.out.println("Impossible.");
        			System.out.println();
        		}
        	}else if(b==-1) {
        		b = Math.sqrt(c*c-a*a);
        		if(b>0) {
        			System.out.println("Triangle #"+cnt);
        			System.out.printf("b = %.3f\n",b);
        			System.out.println();
        		}else {
        			System.out.println("Triangle #"+cnt);
        			System.out.println("Impossible.");
        			System.out.println();
        		}
        	}else {
        		c = Math.sqrt(a*a+b*b);
        		if(c>0) {
        			System.out.println("Triangle #"+cnt);
        			System.out.printf("c = %.3f\n",c);
        			System.out.println();
        		}else {
        			System.out.println("Triangle #"+cnt);
        			System.out.println("Impossible.");
        			System.out.println();
        		}
        	}
        }
    }
}