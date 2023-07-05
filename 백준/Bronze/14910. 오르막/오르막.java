import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        // 값 초기화
		String ret = "Good";
		String[] str = sc.nextLine().split(" ");

		for (int i = 0; i < str.length - 1; i++) {
			int a = Integer.parseInt(str[i]);
			int b = Integer.parseInt(str[i + 1]);
            // 비내림차순이 발견될 경우
			if (a > b) {
				ret = "Bad";
				break;
			}
		}

		System.out.println(ret);
	}
}