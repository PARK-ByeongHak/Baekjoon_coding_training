import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); // 1미터제곱 당 사람의 수
		int P = sc.nextInt(); // 파티가 열렸던 곳의 넓이

		int[] arr = new int[5]; //기사에 적힌 사람 수
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i] - L * P + " ");
		}

	}

}