import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nowNode = 0;
        int count = m - 1;

        for (int i = 1; i < n; i++) {
            if (m == 2) {
                System.out.println(nowNode + " " + i);
                nowNode += 1;
            } else {
                System.out.println(nowNode + " " + i);
                nowNode += 1;
                if (count > 0) {
                    nowNode -= 1;
                    count -= 1;
                }
            }
        }
    }
}
