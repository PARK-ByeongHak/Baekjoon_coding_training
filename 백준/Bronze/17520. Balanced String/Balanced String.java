import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			int ans = 1;
			int power = (n % 2 == 0) ? n / 2 : n / 2 + 1;
			
			for(int i = 0; i < power; i++) {
				ans = (ans * 2) % 16769023;
			}
			
			System.out.println(ans);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}