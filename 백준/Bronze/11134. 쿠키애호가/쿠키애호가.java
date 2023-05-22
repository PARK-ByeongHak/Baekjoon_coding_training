import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();// 테스트 케이스 수
        for (int i = 0; i < T; i++) {
        	int N = sc.nextInt();
            int C = sc.nextInt();
            if (N %C ==0 ) {
                System.out.println(N/C);
            } else if (N %C !=0 ) {
                System.out.println((N/C)+1);
            }
        }
    }
}