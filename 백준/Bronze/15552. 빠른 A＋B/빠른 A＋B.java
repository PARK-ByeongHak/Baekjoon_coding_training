import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//콘솔에서 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//콘솔에서 출력하기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		//형변환(문자 → 정수)
		int count = Integer.parseInt(br.readLine());
			
		//문자열 분리
		StringTokenizer st;
			
		for (int i = 0; i < count; i++) {
			//매 반복마다 문자열 분리를 위해 생성과 동시에 문자를 입력받음
			st = new StringTokenizer(br.readLine()," ");
			//분리된 문자를 받음과 동시에 형변환하여 계산
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
		}

		//끝나면 종료 해주기
		br.close();
		//버퍼 비우기(필수)
		bw.flush();
		//끝나면 종료 해주기
		bw.close();
	}   
}
 	