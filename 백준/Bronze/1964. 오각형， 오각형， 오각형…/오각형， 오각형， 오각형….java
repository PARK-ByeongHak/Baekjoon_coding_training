import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] array = new long[N+1];
		array[1] = 5;
		for(int i=2; i<array.length; i++) {
			array[i] = array[i-1] + (i*5) + (1 - (i*2));
		}
		
		System.out.println(array[N] % 45678);
	}

}