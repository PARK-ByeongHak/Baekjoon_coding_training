import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// 주문한 각 맛의 치킨 마릿수
		int b = sc.nextInt();// 후라이드 원하는 인원
		int c = sc.nextInt();// 양념 원하는 인원
		int d = sc.nextInt();// 간장 원하는 인원
        // b, c, d에 각각 a를 대입해서 둘 중 더 작은 수를 모두 더해 출력
        System.out.println(Math.min(a, b)+Math.min(a, c)+Math.min(a, d));
	}
}