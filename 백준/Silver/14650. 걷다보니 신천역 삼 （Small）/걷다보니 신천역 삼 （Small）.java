import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[10];
		dp[2] = 2;
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i-1]*3;
		}
		System.out.println(dp[N]);
		
	}
}