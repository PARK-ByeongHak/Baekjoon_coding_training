import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max=0, min=101;
		for (int i = 1; i <= 7; i++) {
			int N = sc.nextInt();
			if(N%2!=0) {
				max+=N;
				if(N<min) {
					min=N;
				}
			}
		}
		if(max==0&&min==101) {
			System.out.println("-1");
		}else {
			System.out.println(max);
			System.out.println(min);
		}
	}
}