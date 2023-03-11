import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int count;
		
		count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			for (int k= count-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}	
}
 	