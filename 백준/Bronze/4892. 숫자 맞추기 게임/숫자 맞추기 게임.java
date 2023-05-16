import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =1;
        for (; ; ) {

            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            // 홀수 계산식 : n0 * 3 + 1 / 2 * 3 / 9
            // 홀수
            if (n % 2 != 0) {
                n = (((n * 3) + 1) / 2) * 3 / 9;
                System.out.println(count + ". odd " + n);
                //짝수
            } else {
                n = (((n * 3) / 2) * 3) / 9;
                System.out.println(count + ". even " + n);


            }
            count++;
        }

    }
}