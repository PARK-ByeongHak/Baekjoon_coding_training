import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int one=0, two=0;
    	for(int i = 0; i < 3; i++) {
    		int a = sc.nextInt();
    		if(a==1) {
    			one++;
    		}else {
    			two++;
    		}
    	}
    	if(one>two) {
    		System.out.println("1");
    	}else {
    		System.out.println("2");
    	}
    }
}