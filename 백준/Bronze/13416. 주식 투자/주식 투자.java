import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수
        
        for(int i=0; i<T; i++) {
        	int n = sc.nextInt(); // 계산할 일수
        	int sum=0; // 값 초기화
        	for(int j=0; j<n; j++) { // 그날의 세 회사의 주식 손익 계산
        		int a = sc.nextInt();
        		int b = sc.nextInt();
        		int c = sc.nextInt();
        		int max = Math.max(a, Math.max(b, c)); // 가장 높은 값 추출
        		if(max<0) {
        			max=0; // 만약 그 수가 0보다 작으면(손해면) 0으로 변환(구매하지않음)
        		}
        		sum+=max; // 총 이득값에 더함
        	}
        	System.out.println(sum); // 출력
        }
    }
}