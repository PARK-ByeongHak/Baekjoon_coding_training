import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();// 임의의 3의 배수
		
		int sum = 1;
		int count = 2;
		
		for(int i=9;i<N;i+=3) {
			sum += count;
			count += 1;
		}
		
		System.out.println(sum);
	}
}