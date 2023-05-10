import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 심사위원 수 입력
		int n = sc.nextInt();
		String str = sc.next();
		String[] restr = str.split("");
		int A=0, B=0;
		// 반복문
		for (int i = 0; i < restr.length; i++) {
			if(restr[i].equals("A")) {
				A++;
			}else {
				B++;
			}
		}
		if(A>B) {
			System.out.println("A");
		}else if(A<B) {
			System.out.println("B");
		}else {
			System.out.println("Tie");
		}
	}
}