import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// 입력받고 HashSet에 저장
		Set<Integer> check = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<M; i++) {
			int k = Integer.parseInt(st.nextToken());
			for (int j=k; j<=N; j+=k) {
				check.add(j);
			}
		}

		// HashSet에 저장된 값 더하여 정답 도출
		int sum = 0;
		for (int i : check) {
			sum += i;
		}
		System.out.println(sum);
	}
}