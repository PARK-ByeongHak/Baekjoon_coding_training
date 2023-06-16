import java.util.*;

public class Main {
	static int N; // 친구 수
	static int M; // 공받는 횟수
	static int L; // 공 옮기는 위치
	static int[] friend; //친구 ArrayList
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();// 친구 수    
		M = sc.nextInt();// 공받는 횟수  
		L = sc.nextInt();// 공 옮기는 위치
		
		//친구 ArrayList 선언
		friend = new int[N+1];
		//공 던진 횟수
		int count = 0;
		//처음 공은 첫 번째 사람이 받으니까 1 증가
		friend[1] = 1;
		int index = 1;
		while(true) {
			//현재 배열의 인덱스 위치의 값이 M이라면 끝
			if(friend[index]==M) break;
			
			if(friend[index]%2==1) index = index + L; //인덱스가 홀수일 경우 시계방향으로 L만큼 공 이동
			else index = index - L; //인덱스가 짝수일 경우 반시계방향으로 L만큼 공 이동
			//시계 방향이면서 배열을 벗어날 때 Index + L;
			if(index>N) index %= N;
			//반시계 방향이면서 배열을 벗어날 때 Index - L;
			else if(index<1) index += N;
			
			friend[index]++;
			count++;
		}
		System.out.println(count);
	}
	
}