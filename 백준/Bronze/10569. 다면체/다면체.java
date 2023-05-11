import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //테스트 케이스 수
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
            // 면의 수 초기화
			int c=0;
            // 꼭짓점 a 와 변 b 입력
			int a=sc.nextInt();
			int b=sc.nextInt();
            // 계산
			c = 2-a+b;
            // 출력
			System.out.println(c);
		}
	}
}