import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}
			
			if(B%A==0) {		// A가 B의 약수 인지 확인
				System.out.println("factor");
			}else if(A%B==0) {	// A가 B의 배수 인지 확인
				System.out.println("multiple");
			}else {				// 관련이 없을 경우
				System.out.println("neither");
			}
		}
	}
}