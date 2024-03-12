import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,H,W;
    static char ch[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //문자열의 길이
        H = Integer.parseInt(st.nextToken()); //가로로 번진 개수
        W = Integer.parseInt(st.nextToken()); //세로로 번진 개수

        ch = new char[N];
        Arrays.fill(ch,'?');

        for(int i=0;i<H;i++){
            String str = br.readLine();
            for(int j=0;j<N*W;j++){
                char c = str.charAt(j);
                //System.out.println(c);
                if(c == '?') continue;
                else{
                    ch[j/W] = c;
                }
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(ch[i]);
        }

    }
}