import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int j = 0; j < n; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					if ((Math.pow(j, 2) + Math.pow(j2, 2) + m) / (j * j2) % 1 == 0)
						cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}