import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // 문의 개수를 long 타입으로 입력받음
        int firstMethod = sc.nextInt(); // 첫 번째 문을 여는 방법

        if (N >= 6) {
            System.out.println("Love is open door");
        } else {
            int method = firstMethod;
            for (long i = 2; i <= N; i++) {
                method = 1 - method; // 다음 문을 여는 방법은 이전과 반대
                System.out.println(method);
            }
        }
        sc.close();
    }
}
