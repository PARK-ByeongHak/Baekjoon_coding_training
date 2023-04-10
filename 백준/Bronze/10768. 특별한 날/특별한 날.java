import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<2) {
			System.out.println("Before");
		}
		if(a==2) {
			if(b<18) {
				System.out.println("Before");
			}
			if(b==18) {
				System.out.println("Special");
			}
			if(b>18) {
				System.out.println("After");
			}
		}
		if(a>2) {
			System.out.println("After");
		}
		
	}

}