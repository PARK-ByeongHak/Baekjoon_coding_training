import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken() + String.valueOf(A));
		//나눠줄 변수
		int i = 2;
		//결과값을 저장할 변수
		String S = "";
		
		//무한루프
		while(true) {
			if(i < A && A % i == 0) {
				S = "No";
				break;
			}
			if(i < B && B % i == 0) {
				S = "No";
				break;
			}
			
			//나눠줄 변수에 반복될때마다 1씩 더한다.
			i++;
			//나너줄 변수가 B값과 같아지면 종료
			if(i == B) {
				S = "Yes";
				break;
			}
		}
		System.out.println(S);
	}

}