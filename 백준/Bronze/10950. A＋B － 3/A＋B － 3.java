import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int  A, B, count;
        
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
        	
			System.out.println(A+B);
		}
	}
}
