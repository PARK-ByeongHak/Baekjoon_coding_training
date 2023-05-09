import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum = 0, score=0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			
			if(a==0) {
				score=0;
				sum+=score;
			}else if(a==1) {
				score++;
				sum+=score;
			}
		}
		System.out.println(sum);
	}
}