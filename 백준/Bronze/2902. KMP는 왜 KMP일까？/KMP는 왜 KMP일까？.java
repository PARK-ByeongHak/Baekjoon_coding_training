import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = "";
		for(int i = 0; i < str.length() ; i++) {
            // 첫 글자와 하이픈 바로 뒤의 문자는 항상 대문자
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				answer += str.charAt(i);
		}
		System.out.println(answer);
	}
}