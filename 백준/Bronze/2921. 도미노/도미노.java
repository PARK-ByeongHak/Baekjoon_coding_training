import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=0; i<=a; i++) {
			for(int j=i; j<=i*2;j++) {
				sum+=j;
			}
		}
		System.out.println(sum);
	}
}	