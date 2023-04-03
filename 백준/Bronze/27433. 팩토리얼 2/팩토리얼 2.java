import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextInt();
 
        System.out.println(factorial(n));
    }
 
    public static long factorial(long n){
        if(n==0) return 1;
        else if(n==1) return n;
        else return factorial(n-1)*n;
    }
}