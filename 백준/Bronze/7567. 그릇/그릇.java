import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dish = sc.nextLine(); // 그릇입력
		sc.close();

		// 입력받은 여러개의 그릇을 하나씩 쪼개어 배열에 담는다.
		String[] arr = dish.split("");

		//그릇의 높이 선언
		int height = 0;
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) { //만약 i번째 그릇 다음 같은 그릇이라면
				height += 5; //5cm를 더해주고
			} else {
				height += 10; // 다른 방식으로 놓인 그릇이라면 10cm를 더해준다.
			}

			if (i + 1 == arr.length) {
				break;
			}
		}

		System.out.println(height + 10); //첫번째 그릇은 무조건 10cm이니 더해주기
	}

}