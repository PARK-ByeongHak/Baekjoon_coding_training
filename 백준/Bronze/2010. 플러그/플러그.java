import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int num = sc.nextInt();
			sum+=num;
		}
        // 멀티탭을 연장하려면 1칸을 써야함
		System.out.println(sum-(cnt-1));
	}
}