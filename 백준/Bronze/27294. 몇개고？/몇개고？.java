import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	
    	if(num2==0) {
    		if(num1>=12&&num1<=16) {
        		System.out.print("320");
        	}else {
        		System.out.print("280");
    		}
    	}else {
    		System.out.print("280");
    	}
    }
}