import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int num = sc.nextInt();
		int count = 0;
 
		while (num >= 5) { // 2와 5가 짝지어지면 0이 하나 이상 생성되는것을 노림
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);
	}
 
}