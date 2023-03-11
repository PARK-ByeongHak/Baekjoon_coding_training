import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int  A, sum=0;
        
        A = sc.nextInt();
        for (int i = 1; i <= A; i++) {
            sum+=i;
		}
    	
		System.out.println(sum);
	}
}
