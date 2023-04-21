import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	if(a<=50&&b<=10) {
    		System.out.println("White");
    	}else if(b>30) {
    		System.out.println("Red");
    	}else {
    		System.out.println("Yellow");
    	}
    	
    }
}
