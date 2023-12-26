import java.io.*;
import java.util.*;

public class Main {
    
	static int n;
	static int m;
	static String[] splited;
	static int gcd;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// A:B로 입력이 들어오기 때문에 :을 기준으로 split을 해 나눠준다.
        splited = br.readLine().split(":");
        // 나눠진 것을 기준을 앞을 n 뒤를 m으로 넣어준다. (그냥은 문자열이니까 Integer.parseInt를 사용)
        n = Integer.parseInt(splited[0]);
        m = Integer.parseInt(splited[1]);
        // 최대공약수를 구해준다.
        gcd = gcd(Math.max(n, m), Math.min(n, m));
        // 최대 공약수로 나눈 값을 결과값으로 출력한다.
        System.out.println(n / gcd + ":" + m / gcd);
    }
	// 최대 공약수
    static int gcd(int a, int b) {
        if (b == 0) {
        	return a;
        }
        return gcd(b, a % b);
    }
}