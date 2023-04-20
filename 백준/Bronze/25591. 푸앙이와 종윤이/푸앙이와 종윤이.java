import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	int n = sc.nextInt();
    	int m = sc.nextInt();

    	int a = 100-n;
    	int b = 100-m;
    	int c = 100-(a+b);
    	int d = a*b;
    	int q = d/100;
    	int r = d%100;
    	
    	System.out.println(a+" "+b+" "+c+" "+d+" "+q+" "+r);
    	System.out.println((c+q)+" "+r);
    }
}
