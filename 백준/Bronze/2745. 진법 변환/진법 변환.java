import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.next();	//10진법으로 변환 전 내용
		int N = sc.nextInt();	//몇 진법인지 알려주는 숫자
		
		int tmp = 1;			//진법 계산 변수
		int ans = 0;			//결과값 초기화
		
		for (int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			
			if('A'<= c && c <= 'Z') {
				ans += (c-'A'+10)*tmp;
			}else {
				ans += (c-'0')*tmp;
			}
			tmp *= N;
		}
		
		System.out.println(ans);
		
    }
}