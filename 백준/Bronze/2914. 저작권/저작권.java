import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 적어도 라는 문자 때문에 이렇게 계산
		System.out.println(a*(b-1)+1);
	}
}