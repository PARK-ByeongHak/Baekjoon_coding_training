import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int count=9, st, max;
		//배열 선언
		int[] Array = new int[count];
		
		//배열 내부에 들어갈 정수 입력
		for (int i = 0; i < count; i++) {
			Array[i] = sc.nextInt();
		}
		max=Array[0];
		st=1;
		for (int j = 1; j < count; j++) {
			if(max<Array[j]) {
				max=Array[j];
				st=j+1;
			}
			
		}
		System.out.println(max);
		System.out.println(st);
		
	}	
}