import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
        	int A = sc.nextInt();
        	int B = sc.nextInt();
        	if (A % B == 0)
				System.out.println((A / B) * (A / B));
			else
				System.out.println(((A / B) + 1) * ((A / B) + 1));
        }
    }
}