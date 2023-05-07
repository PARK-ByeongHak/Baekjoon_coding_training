import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int train = 0;	// 현재 승객 수
		int max = 0;	// 최대 승객 수
		for (int i = 0; i < 4; i++) {
			// 내린 승객 수 a와 탑승한 승객 수 b를 입력받음
			int a = sc.nextInt();
			int b = sc.nextInt();
			// 현재 승객 수 계산
			train = train - a + b;
			// 최대 승객수 보다 높을 경우 최대 승객 기록 갱신
			if(train>=max) {
				max=train;
			}
		}
		// 출력
		System.out.println(max);
	}
}