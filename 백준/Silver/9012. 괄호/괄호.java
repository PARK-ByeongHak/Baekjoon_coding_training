import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스 수
        
        for (int t = 0; t < T; t++) {
            String str = sc.next(); // 괄호 문자열 입력
            
            if (isVPS(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }

    public static boolean isVPS(String str) {
        int balance = 0; // 괄호의 균형을 확인하는 변수
        
        for (char c : str.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            
            // 균형이 깨진 경우 VPS가 아님
            if (balance < 0) {
                return false;
            }
        }
        
        // 균형이 맞고, 마지막에 balance가 0인 경우 VPS
        return balance == 0;
    }
}
