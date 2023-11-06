import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] view = new int[N];
        for (int i = 0; i < N; i++) {
            view[i] = sc.nextInt();
        }

        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        int res = 0;

        for (int i = 0; i < N; i++) {
            if (score[i] == 0) {
                res += view[i];
            }
        }

        int totalView = 0;
        for (int i = 0; i < N; i++) {
            totalView += view[i];
        }

        System.out.println(totalView);
        System.out.println(res);
    }
}
