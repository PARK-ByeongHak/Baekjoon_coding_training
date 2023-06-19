import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String N ="";
		int N8 = 0;
		//8진수 값이 저장될 변수
		int N16 = 0;
		//16진수 값이 저장될 변수
		
		if(X.charAt(0) == '0') {
			//1자리 0인지 체크
			if(X.charAt(1) == 'x') {
				//2자리 x 면 16진수 for 문 실행
				for(int i = 2; i < X.length(); i++) {
					N += X.charAt(i);
					}
					N16 = Integer.valueOf(N, 16);
			}else {
				//2자리 x가 아님 8진수로 간주하고 8진수로 변환
				for(int i = 1; i < X.length(); i++) {
					N += X.charAt(i);
					}
					N8 = Integer.valueOf(N, 8);
				}
			}else {
		System.out.println(X);
	}
		
		if(N8 != 0 || N16 != 0) {
		System.out.println(N8 > N16 ? N8 : N16);
		//둘 중하나라도 0이 아니면 8진수 아니면 16진수 이기때문에 그수를 출력
		}
	}
}