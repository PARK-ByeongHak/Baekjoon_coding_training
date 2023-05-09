import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int sum = 0;
            for(int j=0; j<n; j++) {
            	int a = sc.nextInt();
            	sum+=a;
            }
            System.out.println(sum);
        }
        
	}
}