import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			if(N==0) break;
			
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for(int i=0;i<N;i++) {
				int number = sc.nextInt();
				
				sum += number;
				max = Math.max(max, sum);
				
				if(sum<0) sum = 0;
			}
			System.out.println(max);
		}
	}
}