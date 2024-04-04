import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        findMagicPrimes(N, "");
    }

    public static void findMagicPrimes(int n, String number) {
        if (n == 0) {
            if (isPrime(Integer.parseInt(number))) {
                System.out.println(number);
            }
            return;
        }

        for (int i = (number.isEmpty() ? 2 : 0); i <= 9; i++) {
            if (isPrime(Integer.parseInt(number + i))) {
                findMagicPrimes(n - 1, number + i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
