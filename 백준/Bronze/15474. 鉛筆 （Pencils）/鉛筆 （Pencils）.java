import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		// 각 루트 별 구매해야 하는 횟수 계산
		int root1 = a/b+(a%b!=0?1:0);
		int root2 = a/d+(a%d!=0?1:0);
		// 어느 쪽이 더 저렴한지 구분하여 출력
		System.out.println(root1*c>root2*e?root2*e:root1*c);
	}
}