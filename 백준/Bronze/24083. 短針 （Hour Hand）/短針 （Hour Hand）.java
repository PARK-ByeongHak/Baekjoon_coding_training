import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();	// 짧은 바늘이 가리키는 시간(숫자)
        int b = sc.nextInt();	// 경과 시간(숫자)
        int t = a+b;			// 총 시간(숫자)
        while(true) {
        	if(t<=12) {			// 바늘을 가리키는 시간이 12이하 일 경우(시계의 숫자)
        		break;
        	}
        	t-=12;				// 조건을 만족할 때 까지 12씩 빼기
        }
        System.out.println(t);	// 출력
    }
}
