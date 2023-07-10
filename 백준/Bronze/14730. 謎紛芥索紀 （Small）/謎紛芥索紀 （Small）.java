import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int num = sc.nextInt();
		int sum = 0;
        
        // x에 1을 대입한 값을 찾는 문제기 때문에 항의 계수와 차수만 곱하고 더해주면 된다.
		for(int i=0;i<num;i++)
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			sum += n*x;
		}
		System.out.println(sum);
	}
}