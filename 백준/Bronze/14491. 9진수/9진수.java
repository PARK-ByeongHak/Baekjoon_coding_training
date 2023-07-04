import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(convert(t));
        sc.close();
    }

    public static String convert(int t) {
        int tmp = t;
        StringBuilder sb = new StringBuilder();
        while (tmp > 0) {
            sb.append(tmp % 9);
            tmp /= 9;
        }
        return sb.reverse().toString();
    }
}