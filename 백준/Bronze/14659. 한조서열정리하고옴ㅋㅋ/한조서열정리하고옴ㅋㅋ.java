import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i=0;i<N;i++) array[i] = sc.nextInt();
		
		int count = 0; // 죽인 유저 수 세기
		
		int result = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			count = 0;
			for(int j=i+1;j<N;j++) {
				//array[i] : 기준보다 다음 배열값보다 자기가 큰 경우 유저 죽여
				if(array[i]>array[j]) count++;
				
				//자기보다 크면
				else break;
			}
			//최댓값 찾아
			result = Math.max(result, count);
		}
		
		System.out.println(result);
		
	}
}