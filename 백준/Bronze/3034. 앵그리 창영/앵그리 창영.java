import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		for(int i=0; i<a; i++) {
			int fire = sc.nextInt();
            // 대각선 계산법은 가로^2+세로^2=대각선^2이다.
            // 그러므로 가로^2+세로^2보다 작거나 같으면 들어간다.
			if((b*b)+(c*c)>=(fire*fire)) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
	}
}