import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A, B;	
        
        A = sc.nextInt();
        if (A%4==0) {
			B=1;
			if (A%100==0) {
				B=0;
				if (A%400==0) {
					B=1;
				}
			}
		}else {
			B=0;
		}
        System.out.println(B);
	}
}
