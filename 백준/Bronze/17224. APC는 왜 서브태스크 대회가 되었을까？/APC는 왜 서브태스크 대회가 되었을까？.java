import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    int N, L, K, a, b, i, easy = 0, hard = 0, score = 0;

    N = sc.nextInt();
    L = sc.nextInt();
    K = sc.nextInt();

    for (i = 0; i < N; i++) {
        a = sc.nextInt();
        b = sc.nextInt();

        if (b <= L)
            hard++;
        else if (a <= L)
            easy++;
    }

    score = Math.min(hard, K) * 140;

    if (hard < K)
        score += Math.min(easy, K - hard) * 100;

    System.out.println(score);

    sc.close();
}
}