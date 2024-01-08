import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
	static int a;
	static int b;
	static int n;
	static int min;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(br.readLine());
		
		min = Math.abs(a - b); // 현재 주파수와 듣고싶은 주파수의 차이
		
		// 즐겨찾기 입력받기
		for (int i = 0; i < n; i++) {
			// 즐겨찾기 값을 받아서 저장
			int favorite = Integer.parseInt(br.readLine());
			// (즐겨찾기와 듣고싶은 주파수의 차이) + 즐겨찾기로 이동하는 수 +1 vs 지금까지 최소 차이 
			min = Math.min(Math.abs(b - favorite) + 1, min);
		}
		// 최소 차이 출력
		System.out.println(min);
	}
}