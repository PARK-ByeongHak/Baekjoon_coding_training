import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 네 수
// 구현
public class Main {
	public static void main(String args[]) throws IOException {
        // 계산을 빠르게 하기 위해서 buffer사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// A B 숫자와 C D 숫자를 합치면 int범위를 넘어감
		long ab = Long.valueOf(st.nextToken() + st.nextToken());
		long cd = Long.valueOf(st.nextToken() + st.nextToken());
		System.out.println(ab + cd);
	}
}