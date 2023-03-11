import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int count, A, B;
		
		count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println("Case #"+i+": "+(A+B));
		}
	}	
}
 	