import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(scan.hasNextLine()) {
			String str = scan.nextLine();

			int small = 0;	// 소문자
			int big = 0;	// 대문자
			int num = 0;	// 숫자
			int space = 0;	// 공백
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				if(ch >=97 && ch <= 122) 
					small ++;
				else if(ch >= 65 && ch <= 90)
					big ++;
				else if(ch >= 48 && ch <= 57)
					num ++;
				else if(ch == 32)
					space ++;
			}
			System.out.println(small + " " + big + " " + num + " " + space);
		}
		scan.close();
	}
}