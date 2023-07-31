import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k1, k2, k3;
        char o1, o2;
        int r1 = 0, r2 = 0;

        k1 = sc.nextInt();
        o1 = sc.next().charAt(0);
        k2 = sc.nextInt();
        o2 = sc.next().charAt(0);
        k3 = sc.nextInt();

        r1 = func(k1, o1, k2);
        r1 = func(r1, o2, k3);
        r2 = func(k2, o2, k3);
        r2 = func(k1, o1, r2);

        if (r1 > r2) {
            System.out.printf("%d%n%d", r2, r1);
        } else {
            System.out.printf("%d%n%d", r1, r2);
        }
    }

    private static int func(int a, char b, int c) {
        int r = 0;
        switch (b) {
            case '+':
                r = a + c;
                return r;
            case '-':
                r = a - c;
                return r;
            case '*':
                r = a * c;
                return r;
            case '/':
                r = a / c;
                return r;
        }
        return r;
    }
}
