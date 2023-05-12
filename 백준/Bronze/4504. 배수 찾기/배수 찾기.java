import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		while(true) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			if(n%a==0) {
				System.out.println(n+" is a multiple of "+a+".");
			}else {
				System.out.println(n+" is NOT a multiple of "+a+".");
			}
		}
	}
}