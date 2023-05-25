import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//테스트 케이스 수
		for(int i=0;i<num;i++)
		{
			int N = sc.nextInt();//테스트 번호
			double D = sc.nextDouble();// 길이
			double A = sc.nextDouble();//열차A 속도
			double B = sc.nextDouble();//열차B 속도
			double F = sc.nextDouble();//파리
			String sum = String.format("%.6f", D/(A+B)*F);
			System.out.println(N+ " " +sum);
		}
	}
}