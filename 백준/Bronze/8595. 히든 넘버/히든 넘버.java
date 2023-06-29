import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int length = Integer.parseInt(br.readLine());
		String word = br.readLine();
		char ch;
		long number = 0L;
		long result =0;
		for(int i = 0 ; i < length ; i++) {
			ch = word.charAt(i);			
			if(ch>=65 && ch<=122) {
					result += (number);
					number = 0L;
			}else {
				number = 10*number+(ch-'0');
			}
		}
		if(number!=0) result += number;
		System.out.println(result);
	}
}