import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A, B, C, D=0;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if (A==B&&B==C) {
			D=D+10000+(A*1000);
		}else if (A==B&&A!=C) {
			D=D+1000+(A*100);
		}else if (A==C&&A!=B) {
			D=D+1000+(A*100);
		}else if (B==C&&A!=C) {
			D=D+1000+(B*100);
		}else if (A>=B) {
				if (A>=C) {
					D=(A*100);
				}else {
	        		D=(C*100);
	        	}
				
        	}else if (B>=C) {
        		D=(B*100);
        	}else {
        		D=(C*100);
        	}
        
        	System.out.println(D);
        
	}
}
