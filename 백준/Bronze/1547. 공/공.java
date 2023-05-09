import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();	// 컵 위치를 바꾼 횟수
		int cup = 1;	// 컵 번호
		for(int i=0; i<M; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			if(cup == X)	
				cup = Y;
			else if(cup == Y)
				cup = X;
		}
		
		System.out.println(cup);
	}
}