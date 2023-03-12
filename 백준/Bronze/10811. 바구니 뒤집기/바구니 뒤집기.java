import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int[] Num = new int[sc.nextInt()];
		//정수 입력
		for (int i = 0; i < Num.length; i++) {
			Num[i]=i+1;
		}
		//서로 다른 나머지의 갯수 측정
		int A = sc.nextInt();
		int tmp;
		
		for (int i = 0; i < A; i++) {
			//역순으로 만들 바구니 번호 2개 받기
			int order1 = sc.nextInt() - 1;
			int order2 = sc.nextInt() - 1;
			//역순으로 위치 바꾸기
			while (order1 < order2) {
				int temp = Num[order1];
				Num[order1++] = Num[order2];
				Num[order2--] = temp;
			}
		}
		//출력
		for (int i = 0; i < Num.length; i++) {
			System.out.print(Num[i]+" ");
		}
	}	
}