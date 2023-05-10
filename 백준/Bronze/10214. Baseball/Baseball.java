import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 주사위게임을 위한 수 입력
		int n = sc.nextInt();
		// 반복문
		for (int i = 0; i < n; i++) {
			// 연세와 고려 점수 초기화
			int yonsei = 0, korea = 0;
			// 야구는 9회까지 진행
			for (int j = 0; j < 9; j++) {
				// 각 점수 입력받아서 더함
				int a = sc.nextInt();
				yonsei+=a;
				int b = sc.nextInt();
				korea+=b;
			}
			// 승무패 여부 확인하여 출력
			if(yonsei>korea) {
				System.out.println("Yonsei");
			}else if(yonsei<korea) {
				System.out.println("Korea");
			}else {
				System.out.println("Draw");
			}
		}
	}
}