import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception{

		FastScanner scan = new FastScanner();
		int n = scan.nextInt();
		int max = -1;
		int[] drivers = new int[n];
		for(int i=0; i<n; i++) {
			drivers[i]=scan.nextInt();
			if(max<drivers[i]) max=drivers[i];
		}
		Arrays.sort(drivers);
		max++; //max 값에 얻을 수 있는 가장 작은 점수를 더해주기때문에 +1 해줌.
		int count = 1; //max 값은 언제나 1등할 수 있기 때문에 count 가 1부터 시작.
		for(int i=n-2; i>=0; i--) {
			int a = drivers[i]+n; //a는 n 점수를 받고 1등이 될 수 있는지 보고 싶은 운전수의 점수
			if(max>a) break; //max 를 넘지 못하면 1등이 될 수 없다.
			
			int b = drivers[i]+n-i; //위에 설명 참고
			max=Math.max(max, b); //max 를 새로 고친다. 다음에 나오는 운전수들은 이 점수를 넘어야 1등이 가능하다.
			count++;
		}
		System.out.println(count);
	}
    public static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        public int nextInt() throws Exception {
            if(st == null || !st.hasMoreTokens()){
                st = new StringTokenizer(br.readLine());
            }
            return Integer.parseInt(st.nextToken());
        }
    }
}