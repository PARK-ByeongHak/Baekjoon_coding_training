import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 별 출력을 위한 수 입력
		int n = sc.nextInt();
		// 반복문
		for (int i = 0; i < n; i++) {
			// 가운데 정렬을 위한 공백 입력
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			// 좌측 별 입력
			System.out.print("*");
			// 가운데 공백 입력
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");

			}
			// 우측 별 입력
			if (i > 0)
				System.out.print("*");
			// 개행
			System.out.println("");
		}
	}
}