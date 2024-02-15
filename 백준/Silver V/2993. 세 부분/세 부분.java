import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		ArrayList<String> arrStr = new ArrayList<>();

		StringBuffer sb;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				for (int k = j + 1; k < str.length(); k++) {
					String strTemp = "";

					sb = new StringBuffer(str.substring(0, j));
					strTemp += sb.reverse().toString();
					sb = new StringBuffer(str.substring(j, k));
					strTemp += sb.reverse().toString();
					sb = new StringBuffer(str.substring(k, str.length()));
					strTemp += sb.reverse().toString();
					arrStr.add(strTemp);
				}
			}
		}
		Collections.sort(arrStr);
		System.out.println(arrStr.get(0));
	}
}