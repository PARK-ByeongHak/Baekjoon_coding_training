import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++) {
        	int num = sc.nextInt();
        	if(Math.abs(num)%2==0) {
        		System.out.println(num+" is even");
        	}else {
        		System.out.println(num+" is odd");
        	}
        }
    }
}
