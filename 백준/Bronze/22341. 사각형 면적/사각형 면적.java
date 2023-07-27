import java.util.Scanner;

public class Main {
    static int N, C;
    static int X, Y;
    static int A, B;
    static int[] Dx = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] Dy = {1, 0, -1, 0, 1, -1, 1, -1};

    static void paper() {
        if (A <= Y || B <= X || X == 0 || Y == 0) return;
        if (X * A <= Y * B) A = Y;
        else B = X;
    }

    static void input() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        C = scanner.nextInt();
        A = N;
        B = N;

        for (int i = 1; i <= C; i++) {
            Y = scanner.nextInt();
            X = scanner.nextInt();
            paper();
        }
        scanner.close();

        System.out.println(A * B);
    }

    public static void main(String[] args) {
        //freopen("input.txt","r",stdin);
        input();
    }
}
