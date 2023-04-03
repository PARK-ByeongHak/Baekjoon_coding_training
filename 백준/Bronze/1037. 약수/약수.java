import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int max = 0;
		int min = 1000000;
		for(int i=0; i<N; i++) {
			int M = sc.nextInt();
			if(M>max) {
				max=M;
			}
			if(min>M) {
				min=M;
			}
		}
		System.out.println(max*min);
	}
}