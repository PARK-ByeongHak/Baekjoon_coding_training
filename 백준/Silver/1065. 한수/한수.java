import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 입력값 N
        
        int count = 0; // 한수의 개수를 저장하는 변수
        
        for (int i = 1; i <= N; i++) {
            if (isHanNumber(i)) {
                count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }

    public static boolean isHanNumber(int num) {
        if (num < 100) {
            return true; // 두 자리 수는 모두 한수
        } else {
            int firstDigit = num / 100;
            int secondDigit = (num / 10) % 10;
            int thirdDigit = num % 10;
            
            return (firstDigit - secondDigit) == (secondDigit - thirdDigit);
        }
    }
}
