import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int Bowl, tmp, Try;
		
		Bowl = sc.nextInt();
		Try = sc.nextInt();
		//배열 선언
		int[] BowlArray = new int[Bowl];
		for (int i = 0; i < BowlArray.length; i++) {
			BowlArray[i]=i+1;
		}
		
		for (int i = 0; i < Try; i++) {
			int firstball = sc.nextInt();
			int secondball = sc.nextInt();
			tmp=BowlArray[firstball-1];
			BowlArray[firstball-1]=BowlArray[secondball-1];
			BowlArray[secondball-1]=tmp;
		}
		for (int i = 0; i < BowlArray.length; i++) {
			System.out.print(BowlArray[i]+" ");
		}
	}	
}