import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            int position = sc.nextInt();  // 오타를 낸 위치
            String word = sc.next();  // 창영이가 친 문자열

            // 오타를 지운 문자열 생성
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(position - 1);

            System.out.println(sb.toString());
        }
    }
}
