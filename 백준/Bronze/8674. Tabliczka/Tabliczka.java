import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	if(a%2==1&&b%2==1) {
    		System.out.println(Math.min(a, b));
    	}else {
    		System.out.println("0");
    	}
    	
    }
}
