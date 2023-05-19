import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//소수 값이 나와야하므로 실수형 사용
		double N = sc.nextDouble();
		
		//루트는 Maht.sqrt 제곱은 Math.pow 사용
		double area = (Math.sqrt(3) / 4) * Math.pow(N, 2);
		
		System.out.println(area);
	}

}