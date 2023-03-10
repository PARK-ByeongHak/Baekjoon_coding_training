import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A, B, C=0;	
        
        A = sc.nextInt();
        B = sc.nextInt();
        if (A>0) {
			if (B>0) {
				C=1;
			}else {
				C=4;
			}
		}else if(A<0){
			if (B<0) {
				C=3;
			}else {
				C=2;
			}
		}
        System.out.println(C);
	}
}
