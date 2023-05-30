import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b>=c) { // 아무리 팔아도 이득이 없거나 오히려 손해일 경우
			System.out.println("-1");
		}else { // 그 외 경우
			System.out.println((a/(c-b))+1);
		}
	}
 
}