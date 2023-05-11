import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt=0;
        
		if(b-a<c-b) {    // 캥거루 a와 b의 거리가 b와 c의 거리보다 짧을 경우
			while(b+1!=c) {
				a=b;
				b++;
				cnt++;
			}
			System.out.println(cnt);
		}else {          // 그 외
			while(b-1!=a) {
				c=b;
				b--;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}