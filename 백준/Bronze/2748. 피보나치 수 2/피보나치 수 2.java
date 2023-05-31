import java.util.Scanner;
 
public class Main {
 
	static long[] array;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		array = new long[N + 1];
 
		for(int i = 0; i < N + 1; i++) {
			array[i] = -1;
		}
        
		array[0] = 0;
		array[1] = 1;
		System.out.println(Fib(N));
	}
	
	public static long Fib(int N) {
		if(array[N] == -1) {
			array[N] = Fib(N - 1) + Fib(N - 2);
		}
		return array[N];
	}
 
}