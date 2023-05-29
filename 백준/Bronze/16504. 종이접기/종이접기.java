import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        
		long Ans = 0, Tmp = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Tmp = sc.nextLong();
                Ans += Tmp;
            }
        }

        System.out.println(Ans);
	}
}