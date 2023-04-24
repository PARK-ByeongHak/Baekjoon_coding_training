import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	for(int i=0; i<t; i++) {
        	String a = sc.next();
        	String b = sc.next();
        	if(a.equals(b)) {
        		System.out.println("OK");
        	}else {
        		System.out.println("ERROR");
        	}
    	}
    }
}