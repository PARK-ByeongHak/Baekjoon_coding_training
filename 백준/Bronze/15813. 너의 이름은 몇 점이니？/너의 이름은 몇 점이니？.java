import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt(); // 길이 입력
        String S = sc.next(); // 문자열 입력

        int sum = 0;
        for (int i = 0; i < leng; i++) {
            int temp = S.charAt(i) - 'A' + 1;
            sum += temp;
        }

        System.out.println(sum);
        sc.close();
    }
}
