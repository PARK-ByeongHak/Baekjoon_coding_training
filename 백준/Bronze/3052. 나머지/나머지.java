import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int[] Num = new int[10];
		//서로 다른 나머지의 갯수 측정
		int cnt=0;
		//i번째와 i+1번째와 비교
		boolean bl;
		
		//정수 입력받기
		for (int i = 0; i < Num.length; i++) {
			Num[i]=sc.nextInt()%42;
		}
		
		for (int i = 0; i < Num.length; i++) {
			//기본값 false
			bl = false;
			for (int j = i+1; j < Num.length; j++) {
				//배열의 i번과 i+1번을 비교
				if (Num[i]==Num[j]) {
					//같을 경우 true로 변경하고 벗어나기
					bl=true;
					break;
				}
			}
			if (bl==false) {
				//bl의 값이 다를 경우(기존과 다른 나머지 일 경우)카운트 증가
				cnt++;
			}
		}
		System.out.println(cnt);
	}	
}