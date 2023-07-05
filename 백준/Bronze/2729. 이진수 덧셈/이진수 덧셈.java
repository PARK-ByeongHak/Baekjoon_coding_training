import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String[] input = sc.nextLine().split(" ");
            String a = input[0];
            String b = input[1];

            String sum = addBinary(a, b);
            System.out.println(sum);
        }

        sc.close();
    }
}
