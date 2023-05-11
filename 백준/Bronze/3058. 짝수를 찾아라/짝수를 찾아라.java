import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 테스트 케이스 수
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
            // min과 sum을 초기화
			int min = Integer.MAX_VALUE;
			int sum=0;
            // 케이스당 7번 반복
			for(int j=0; j<7; j++) {
                // 숫자를 입력
				int a = sc.nextInt();
				
				if(a%2==0) {// 짝수 일 경우 sum에 추가
					sum+=a;
					if(a<min) {// min 보다 작을 경우 min 값을 a로 갱신
						min=a;
					}
				}
			}
            // 출력
			System.out.println(sum+" "+min);
		}
	}
}