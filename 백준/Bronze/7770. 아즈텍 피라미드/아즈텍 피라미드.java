import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//현재 블록의 갯수가 1개면 추가된 블록의 수도 1개이기 때문에 A B 둘다 1로 저장
		int A = 1;
		int B = 1;
		
		//층 -1의 값을 저장 할 변수.
		//만약 무한루프에서 i에 +1을 먼저 해주면 0으로 저장해야하지만 필자는 마지막에 +1을 해주기때문에 1로 저장.
		int i = 1;
		
		//무한 루프
		while(true) {
			B += 4 * i;
			A += B;
			if(A > n) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}