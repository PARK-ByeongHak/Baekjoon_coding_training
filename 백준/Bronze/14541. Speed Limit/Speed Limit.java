import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while (n != -1) { // -1이 들어올 때 까지 반복
			int miles = 0;
			int before = 0;
			for (int i = 0; i < n; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				
				miles += s * (t - before);
				before = t;
			}
			
			System.out.println(miles + " miles"); // 입력 받은 값을 계산하여 출력
			
			n = sc.nextInt();
		}
	}
}