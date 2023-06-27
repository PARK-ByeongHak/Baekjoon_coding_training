import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int belt = 0;
		int beltm = 1;
		
		for (int i = 0; i < M; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int s = scanner.nextInt();
			
			if (s == 1) {
				if (belt == 0)
					belt = 1;
				else if (belt == 1)
					belt = 0;
			}
			
			beltm = (beltm / a) * b;
		}
		
		System.out.println(belt + " " + beltm);
		scanner.close();
	}

}
