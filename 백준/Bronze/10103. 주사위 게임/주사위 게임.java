import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 주사위게임을 위한 수 입력
		int n = sc.nextInt();
        // 창영이와 상덕이의 점수 기본값 적용(각 100점)
		int chang = 100;
		int sang = 100;
		// 반복문
		for (int i = 0; i < n; i++) {
            // 창영이와 상덕이의 각 주사위 수 입력
			int a = sc.nextInt();
			int b = sc.nextInt();
            
			if(a>b) {// 창영이가 더 높을 경우
                // 상덕이 점수에서 창영이의 주사위 수 감점
				sang-=a;
                
			}else if(a<b) {// 상덕이가 더 높을 경우
                // 창영이 점수에서 상덕이의 주사위 수 감점
				chang-=b;
			}
		}
        // 각 점수 출력
		System.out.println(chang);
		System.out.println(sang);
	}
}