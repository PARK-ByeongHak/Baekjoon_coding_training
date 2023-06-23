import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int num = 1;

		// 맨처음 처리
		String start = s.substring(0, 1);
		
		//c일 경우 26을 곱하고, d이면 10 곱한다.
		if (start.equals("c")) num *= 26;
		else num *= 10;

		for (int i = 0; i < s.length() - 1; i++) {
			String a = s.substring(i, i + 1);
			String b = s.substring(i + 1, i + 2);

			// 앞 문자와 뒷 문자가 c로 같다면 25를 곱하고 아니면 10을 곱한다.
			if (a.equals("c")) {
				if (a.equals(b)) num *= 25;
				else num *= 10;
			}
            
            // 앞 문자와 뒷 문자가 d로 같다면 9를 곱하고 아니면 26을 곱한다.
			else if (a.equals("d")) {
				if (a.equals(b)) num *= 9;
				else num *= 26;
			}
		}
		
		//출력
		System.out.println(num);
	}
}