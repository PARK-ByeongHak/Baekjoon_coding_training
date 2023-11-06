import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String P = scanner.next();

        System.out.println(P); // P를 그대로 출력하면 P만이 유일한 비밀번호가 됨(완전히 같으므로)
        scanner.close();
    }
}
