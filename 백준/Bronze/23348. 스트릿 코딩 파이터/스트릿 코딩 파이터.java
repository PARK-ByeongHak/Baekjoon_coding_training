import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        // 한손 코딩, 노룩 코딩, 폰 코딩 난이도(배점)
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        // 참여 팀 수
		int N = sc.nextInt();
        // 최고점 초기화
		int win = 0;
        // 팀 수 만큼 반복
		for (int i = 0; i < N; i++) {
            // 팀 점수 합계 초기화
			int sum = 0;
			for (int j = 0; j < 3; j++) { // 개인 점수 더하기(팀원은 3명 고정)
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				sum += x * a + y * b + z * c;
			}
			if (win < sum) {
				win = sum;
			}
		}
		System.out.print(win);
	}
}