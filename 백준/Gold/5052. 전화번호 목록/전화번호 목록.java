import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 전화번호의 수
            String[] phoneNumbers = new String[n];

            for (int j = 0; j < n; j++) {
                phoneNumbers[j] = sc.next();
            }

            Arrays.sort(phoneNumbers); // 전화번호 정렬
            boolean consistent = true;

            for (int j = 0; j < n - 1; j++) {
                if (phoneNumbers[j + 1].startsWith(phoneNumbers[j])) {
                    consistent = false;
                    break;
                }
            }

            System.out.println(consistent ? "YES" : "NO");
        }
        sc.close();
    }
}
