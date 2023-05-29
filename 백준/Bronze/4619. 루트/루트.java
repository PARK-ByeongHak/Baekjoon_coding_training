import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트 케이스의 수가 정해져있지 않으니 무한루프 사용
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			//B와 근접한 A값을 저장할 변수
			int num1 = 0;
			int num2 = 0;
			
			//0 0 입력되면 무한루프 종료
			if(B == 0 && N == 0) {
				break;
			}
			
			int A = 0;
			//반복 횟수를 정하기 애매하기에 무한루프 사용
			while(true) {
				//A의 N제곱이 B보다 작거나 같거나 클때에 맞춰 num1 num2에 저장. 클경우엔 저장하고 반복문 종료
				//간단히 설명하면 B보다 작을때는 계속 저장하다보면 작은 수중 제일 작은 수가 저장될 것이다.
				//큰 수는 한번이라도 나오면 저장하고 종료되게 해둔 것이다.
				if(Math.pow(A, N) <= B) {
					num1 = A;
				}else if(Math.pow(A, N) > B){
					num2 = A;
					break;
				}
				//반복문이 계속되는 동안 A에 1씩 더해간다.
				A++;
			}
			//삼항연산자로 A의 N제곱과 B의 차이가 누가 더 큰가를 본다.
			//하지만 두 갑의 차이를 보는 것이기에 음수가 나오면 안되니 절댓값으로 구해준다.
			int result = (Math.abs(Math.pow(num1, N) - B) <= Math.abs(Math.pow(num2, N) - B)) ? num1 : num2;
			
			System.out.println(result);
		}
	}

}