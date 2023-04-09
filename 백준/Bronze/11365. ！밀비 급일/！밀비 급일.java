import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "";
		while (true) {
			str = sc.nextLine();// 문자열 입력받기
			if (str.equals("END")) {
				break;
			}
			String[] arr = str.split(""); // 하나씩 쪼개서 배열에 넣고
			for (int i = arr.length - 1; i >= 0; i--) { // 뒤에서부터 출력한다.
				System.out.print(arr[i]);
			}
			System.out.println();

		}
	}

}