import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수열의 크기
		
		int[] array = new int[N];
		
		// 수열 입력
		for(int i=0;i<N;i++) array[i] = sc.nextInt();
		
		int sum = 0; // 오르막길마다 합
		int result = 0; // 최종 오르막길 최대값
		
		for(int i=0;i<N-1;i++) {
			//앞에 있는 값이 뒤에 있는 값보다 작으면 빼서 sum에 넣기
			if(array[i]<array[i+1]) sum += (array[i+1]-array[i]);
			//작으면 sum을 0으로
			else sum = 0;
			//최대값비교
			result = Math.max(result, sum);
		}
		System.out.println(result);
	}
}