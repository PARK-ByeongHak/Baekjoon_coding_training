import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String c = st.nextToken();
			
			//c°¡ Â¦¼öÀÏ¶§
			int lastOfC = c.charAt(c.length()-1) - '0';
			if((lastOfC&1) == 0) { 
				System.out.println(a);
				return;
			}
			
			int result = 0;
			int cur = 1;
			while( a + b != 0 ) {
			if(( a & 1 ) + ( b & 1 ) == 1) result += cur;
			
			a = a>>1;
			b = b>>1;
			cur = cur<<1;
			}
			
			System.out.println(result);
	}
}