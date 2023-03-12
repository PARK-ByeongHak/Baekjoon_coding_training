import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int Bowl, Ball, Try;
		
		Bowl = sc.nextInt();
		Ball = Bowl;
		Try = sc.nextInt();
		//배열 선언
		int[] BowlArray = new int[Bowl];
		for (int i = 0; i < BowlArray.length; i++) {
			BowlArray[i]=0;
		}
		
		for (int i = 0; i < Try; i++) {
			int firstbowl = sc.nextInt();
			int lastbowl = sc.nextInt();
			int Tryball = sc.nextInt();
			for (int j = firstbowl-1; j < lastbowl; j++) {
				BowlArray[j]=Tryball;
			}
		}
		for (int i = 0; i < BowlArray.length; i++) {
			System.out.print(BowlArray[i]+" ");
		}
	}	
}