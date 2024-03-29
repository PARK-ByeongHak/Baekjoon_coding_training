import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(solution(new BufferedReader(new InputStreamReader(System.in))));
    }

    private static int solution(BufferedReader br) throws IOException {
        int answer =0;
        int N = Integer.parseInt(br.readLine());
        int[] menuArr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt =0;
        for(int i=0; i<2*N; i++) {
            int idx = Integer.parseInt(st.nextToken());
            if(++menuArr[idx] ==1) {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(cnt,answer);
        }

        return answer;
    }
}