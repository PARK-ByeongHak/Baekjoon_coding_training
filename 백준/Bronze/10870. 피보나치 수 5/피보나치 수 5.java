import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextInt();
		
		System.out.println(fibonacci(N));
		
	}
	
	public static long fibonacci(long N) {
		if(N == 0) return 0;
		if(N <= 1) return 1;	// 재귀 종료조건
		return fibonacci(N-1)+fibonacci(N-2);		
	}
}
