import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int n = l, sum = 0, t = 2;

        while (true) {
            n *= (double) r / 100;
            if (n <= 5) // 자라야 할 길이가 5이하면 더이상 자라지않음
                break;
            sum += t * n;
            t *= 2;
        }
        System.out.println(sum);
    }
}
