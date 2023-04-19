import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 각 수치 입력 받음
		double a1=sc.nextDouble();
		double p1=sc.nextDouble();
		double r1=sc.nextDouble();
		double p2=sc.nextDouble();
        // 계산하기
		double x=a1/p1, y=Math.PI*r1*r1/p2;
        // 어느 쪽이 더 이득인가 확인하여 출력
		if(x<y) {
			System.out.println("Whole pizza");
		}else {
			System.out.println("Slice of pizza");
		}
	}
}