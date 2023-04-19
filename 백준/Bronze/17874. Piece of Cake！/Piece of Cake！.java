import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a-c<=c&&a-b<=b) {
			System.out.println(b*c*4);
		}else if(a-c>c&&a-b<=b) {
			System.out.println(b*(a-c)*4);
		}else if(a-c<=c&&a-b>b) {
			System.out.println((a-b)*c*4);
		}else {
			System.out.println((a-b)*(a-c)*4);
		}
		
	}
}