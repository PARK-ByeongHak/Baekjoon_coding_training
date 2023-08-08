import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 제거

        while (N > 0) {
            String a = scanner.next();
            String b = scanner.next();
            String sum = "";

            StringBuilder sbA = new StringBuilder(a);
            StringBuilder sbB = new StringBuilder(b);
            sbA.reverse();
            sbB.reverse();

            int aInt = Integer.parseInt(sbA.toString());
            int bInt = Integer.parseInt(sbB.toString());

            int sumInt = aInt + bInt;
            sum = Integer.toString(sumInt);

            StringBuilder sbSum = new StringBuilder(sum);
            sbSum.reverse();
            sumInt = Integer.parseInt(sbSum.toString());

            System.out.println(sumInt);
            N--;
        }
    }
}
