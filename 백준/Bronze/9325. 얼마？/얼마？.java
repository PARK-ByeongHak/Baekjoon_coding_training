import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=0; j<y; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				x+=a*b;
			}
			System.out.println(x);
		}
	}
}