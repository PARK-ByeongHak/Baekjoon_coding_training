import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A, B;	
        
        A = sc.nextInt();
        B = sc.nextInt();
        if (B<45) {
			A--;
			B= 60-(45-B);
	        if (A<0) {
				A=23;
			}
	        System.out.println(A+" "+B);
        }else {
        	System.out.println(A+" "+(B-45));
        }
	}
}
