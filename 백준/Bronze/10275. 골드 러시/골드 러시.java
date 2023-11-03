import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
        
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			long a = sc.nextLong();
			long b = sc.nextLong();	
			int count = 0;
            
			while (a % 2 == 0) {
				a /= 2;
				count += 1;
			}
			System.out.println(n - count);
		}
	}
}