import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "";
		while (true) {
			int cnt=0;
			str = sc.nextLine();// 문자열 입력받기
			if (str.equals("#")) {
				break;
			}
			String[] arr = str.split("");
			for (int i = arr.length - 1; i >= 0; i--) {
				if(arr[i].equals("a")||arr[i].equals("e")||arr[i].equals("i")||arr[i].equals("o")||arr[i].equals("u")) {
					cnt++;
				}
				if(arr[i].equals("A")||arr[i].equals("E")||arr[i].equals("I")||arr[i].equals("O")||arr[i].equals("U")) {
					cnt++;
				}
			}
			System.out.println(cnt);

		}
	}

}