import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] gold = new int[n];
		int max =0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==b&&b==c) {
				gold[i] = 10000+a*1000;
			}else if(a==b) {
				gold[i] = 1000+a*100;
			}else if(a==c) {
				gold[i] = 1000+a*100;
			}else if(c==b) {
				gold[i] = 1000+b*100;
			}else {
				gold[i] = Math.max(a, Math.max(b, c))*100;
			}
			if(max<gold[i]) {
				max=gold[i];
			}
		}
		System.out.println(max);
	}
}