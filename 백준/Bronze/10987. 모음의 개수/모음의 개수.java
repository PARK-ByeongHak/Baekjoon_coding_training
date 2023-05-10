import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 단어 입력받아서 각 글자를 배열에 삽입
        String N = sc.nextLine();
        String[] str = N.split("");
        // 카운트 초기화
        int cnt=0;
        for (int i = 0; i < str.length; i++) {
            // str[i] 가 'a', 'e', 'i', 'o', 'u' 중 하나에 해당할 경우 카운트 추가
        	if(str[i].equals("a")||str[i].equals("e")||str[i].equals("i")||str[i].equals("o")||str[i].equals("u")) {
        		cnt++;
        	}
        }
        // 카운트 수 출력
        System.out.println(cnt);
	}
}