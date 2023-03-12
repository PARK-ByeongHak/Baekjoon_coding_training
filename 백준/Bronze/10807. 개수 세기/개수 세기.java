import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int count, A, Numcount=0;
		//배열 갯수 선언(받을 정수의 갯수)
		count = sc.nextInt();
		//배열 선언
		int[] Array = new int[count];
		//배열 내부에 들어갈 정수 입력
		for (int i = 0; i < count; i++) {
			Array[i] = sc.nextInt();
		}
		//특정 숫자의 개수 체크를 위한 특정 숫자 정의
		A = sc.nextInt();
		//특정 숫자의 개수 체크
		for (int j = 0; j < count; j++) {
			if(Array[j]==A) {
				Numcount++;
			}
		}
		//출력
		System.out.println(Numcount);
	}	
}