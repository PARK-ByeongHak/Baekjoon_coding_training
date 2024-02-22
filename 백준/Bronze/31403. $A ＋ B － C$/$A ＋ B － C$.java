import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 A, B, C 입력
        int A = Integer.parseInt(scanner.nextLine());
        int B = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());

        // A, B, C를 수로 생각했을 때의 결과 출력
        int resultNumeric = A + B - C;
        System.out.println(resultNumeric);

        // A, B, C를 문자열로 생각했을 때의 결과 출력
        String resultString = Integer.toString(A) + Integer.toString(B);
        int result = Integer.parseInt(resultString) - C;
        System.out.println(result);
    }
}
