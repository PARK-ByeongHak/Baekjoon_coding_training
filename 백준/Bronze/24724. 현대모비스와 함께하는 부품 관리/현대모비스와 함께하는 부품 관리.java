import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); // 부품의 개수
		
		for(int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			StringTokenizer st= new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			System.out.println("Material Management " + i);
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
			}
			
			System.out.println("Classification ---- End!");
		}
	}
}