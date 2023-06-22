import java.util.*;

public class Main {
	
	static int n, k;
	
	static boolean input() {
		boolean state;
		
		try(Scanner kb = new Scanner(System.in)) {
			n = kb.nextInt();
			k = kb.nextInt();
			state = true;
		}
		catch(Exception e) {
			state = false;
		}
		return state;
	}
	
	static int reverse(int n) {
		String s = String.valueOf(n);
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		int answer = 0;
		for(int i = 0; i < sb.length(); i++) {
			answer += (int)(sb.charAt(i) - '0') * (int)Math.pow(10, sb.length() - i - 1);
		}
		return answer;
	}
	
	static int max() {
		int answer = 0;
		
		for(int i = 1; i <= k; i++) {
			int t = n * i;
			t = reverse(t);
			if(t > answer) answer = t;
		}
		return answer;
	}

	public static void main(String[] args) {
		if(input()) {
			System.out.println(max());
		}
	}
}