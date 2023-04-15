import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자 입력 받기
        int a = sc.nextInt();
        // 한글로 '가' 는 44031번이라서 이 숫자만큼 더하기
        a += 44031;
        // char로 변환
        char str = (char)a;
        // 출력
        System.out.println(str);
    }
}