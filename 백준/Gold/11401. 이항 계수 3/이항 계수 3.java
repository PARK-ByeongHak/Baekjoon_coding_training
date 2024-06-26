import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	final static long P = 1000000007;
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Long.parseLong(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		
		// 분자 N!
		long numer = factorial(N);
		
		// 분모 (K! * (N-K)!) mod p
		long denom = factorial(K) * factorial(N - K) % P;	
	
		
		// N! * 분모의 역원((K! * (N-K)!) 
		System.out.println(numer * pow(denom, P - 2) % P);
		
	}
	
	
	// 팩토리얼 함수 
	public static long factorial(long N) {
		long fac = 1L;
		
		while(N > 1) {
			fac = (fac * N) % P;
			N--;
		}
		return fac;
	}
	
 
	public static long pow(long base, long expo) {
		// 지수가 1일 경우 base^1 이므로 base % P를 리턴
		if(expo == 1) {
			return base % P;
		}
		
		// 지수의 절반에 해당하는 base^(expo / 2) 을 구한다.
		long temp = pow(base, expo / 2);
		
		if(expo % 2 == 1) {
			return (temp * temp % P) * base % P;
		}
		return temp * temp % P;
		
	}
	
 
}