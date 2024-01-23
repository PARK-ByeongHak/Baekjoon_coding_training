import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//System.setIn(new FileInputStream("Test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		char wheel[] = new char[N];
		int cur = 0; //현재 바퀴가 가리키고 있는 위치
		
		//바퀴 돌리기
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			char ch = st.nextToken().charAt(0);
			
			//배열을 벗어나면 그만큼 빼주기 (0부터 시작)
			cur = cur+S >=N ? (cur+S)%N : cur+S;
			//행운의 바퀴가 없다면 종료, (이미 그 자리에 다른 알파벳이 있어서 중복된다면)
			if(wheel[cur] != 0 && wheel[cur] != ch) {
				System.out.println("!");
				return;
			}
			
			wheel[cur]=ch;
		}
		
		//출력
		String res = "";
		for (int i = cur; i >= 0; i--) {
			
			if(wheel[i] == 0) {
				res+="?";
			} else if(res.contains(Character.toString(wheel[i]))) { //바퀴에 같은 글자는 두번이상 등장하지 않는다. 
				System.out.println("!");
				return;
			}
			else {
				res+=wheel[i];
			}
		}
		for (int i = N-1; i > cur; i--) {
			if(wheel[i] == 0) {
				res+="?";
			} else if(res.contains(Character.toString(wheel[i]))) { //바퀴에 같은 글자는 두번이상 등장하지 않는다. 
				System.out.println("!");
				return;
			}
			else {
				res+=wheel[i];
			}
		}
		
		System.out.println(res);
		
		
		
	}

}