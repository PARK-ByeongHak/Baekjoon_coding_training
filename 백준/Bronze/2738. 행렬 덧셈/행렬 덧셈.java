import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	//2차원 배열의 길이 N, M을 입력받아서 배열을 정의함
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		
		//2차원 배열에 값을 넣음
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					arr[j][j2] += sc.nextInt();
				}
			}
		}
		//계산 후 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
    }
}