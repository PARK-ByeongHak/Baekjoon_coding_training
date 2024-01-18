import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int [] height = new int[11];
		height[1] = 0;
		height[2] = 1;
		for(int i=3; i<=10; i++) {
			int max = 0;
			for(int j=1; j<=i/2; j++) {
				if(max < j*(i-j)) {
					max = (j*(i-j));
					height[i] = j;   //곱이 최대가 될 때의 높이(중 하나)를 저장
				}
			}
		}
		int [] dp = new int[11];
		dp[1] = 0;
		dp[2] = 1;
		for(int i=3; i<=10; i++) {
			dp[i] = pizza(i, height);
		}
		System.out.println(dp[n]);
	}	
	
	public static int pizza(int n, int [] height) {
		int a = height[n];
		int b = n - height[n];
		if(a == 1 && b != 1) return (a*b) + pizza(b, height);
		if(a != 1 && b == 1) return (a*b) + pizza(a, height);
		if(a == 1 && b == 1) return a*b;
		return (a*b) + pizza(a, height) + pizza(b, height);
	}
}