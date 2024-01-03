import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[][] s = new int[2][4];
		
		for(int n = 0; n<4; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<2; i++) {
				for(int j = 0; j <4; j++) {
					s[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			if(s[0][0] > s[1][2] || s[0][1] > s[1][3] || s[0][2] < s[1][0] || s[0][3] < s[1][1]){
				//겹치지 않음
                sb.append("d").append("\n");
            }else if((s[0][0] == s[1][2] && s[0][1] == s[1][3]) || (s[0][0] == s[1][2] && s[0][3] == s[1][1]) ||
					(s[0][2] == s[1][0] && s[0][1] == s[1][3]) || (s[0][2] == s[1][0] && s[0][3] == s[1][1])){
				//점
                sb.append("c").append("\n");
            }else if(s[0][0] == s[1][2] || s[0][1] == s[1][3] || s[0][2] == s[1][0] || s[0][3] == s[1][1]){
				//선분
                sb.append("b").append("\n");
            }else {
                //직사각형
                sb.append("a").append("\n");
            }
		}
		System.out.println(sb);
	}
}