import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		String s = br.readLine();
		
		int str = s.charAt(0);
		int i = "I".charAt(0);
		
		
		System.out.println((Math.abs(str - i) + 84));
	}

}