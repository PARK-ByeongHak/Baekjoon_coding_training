import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		int x=p*a;
		int y=0;
		if(p-c>0) {
			y=b+((p-c)*d);
		}else {
			y=b;
		}
		if(x<y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}
	}
}