import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int student=30, work=28;

		int[] sArray = new int[student];
		int[] wArray = new int[work];
		for (int i = 0; i < sArray.length; i++) {
			sArray[i]=i+1;
		}
		for (int i = 0; i < wArray.length; i++) {
			wArray[i] = sc.nextInt();
		}
		for (int i = 0; i < sArray.length; i++) {
			for (int j = 0; j < wArray.length; j++) {
				if (sArray[i]==wArray[j]) {
					sArray[i]=0;
				}
			}
		}
		
		for (int i = 0; i < sArray.length; i++) {
			if(sArray[i]!=0) {
				System.out.println(sArray[i]+" ");
			}
		}
	}	
}