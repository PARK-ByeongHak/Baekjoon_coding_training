import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int count, A, min=0, max=0;
		//배열 갯수 선언(받을 정수의 갯수)
		count = sc.nextInt();
		//배열 선언
		int[] Array = new int[count];

		//배열 내부에 들어갈 정수 입력
		for (int i = 0; i < count; i++) {
			Array[i] = sc.nextInt();
		}
		min=Array[0];
		max=Array[0];
		
		for (int j = 1; j < count; j++) {
			if(min>Array[j]) {
				min=Array[j];
			}
		}
		for (int j = 1; j < count; j++) {
			if(max<Array[j]) {
				max=Array[j];
			}
		}
		System.out.println(min+" "+max);
		
	}	
}