import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        
        char start = 'A';
        int time = 0;
        
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int temp = Math.abs(c - start);
            time += Math.min(temp, 26 - temp);  //왼쪽으로 돌리는 것, 오른쪽으로 돌리는 것 중 최소
            start = c;
        }
        bw.write(time + "\n");

        bw.flush();
        br.close();
        bw.close();
	}

}