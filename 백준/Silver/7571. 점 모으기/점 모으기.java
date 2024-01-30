import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<Integer> xList = new ArrayList<Integer>();
		List<Integer> yList = new ArrayList<Integer>();
		
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			xList.add(x);
			yList.add(y);
		}
		Collections.sort(xList);
		Collections.sort(yList);
		int midIdx = (M/2);
		int midX = xList.get(midIdx);
		int midY = yList.get(midIdx);
		int Score = 0;
		for (int i = 0; i < M; i++) {
			Score += Math.abs(midX-xList.get(i));
			Score += Math.abs(midY-yList.get(i));
		}
		System.out.println(Score);
	}
}