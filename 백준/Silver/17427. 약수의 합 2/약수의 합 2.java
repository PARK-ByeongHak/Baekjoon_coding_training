import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int N;
		long res = 0; // 입력 범위는 1000000까지임 
        
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			res += i * (N/i);
		}
		System.out.println(res);
	}
}