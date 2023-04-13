import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 한글 입력 받기
        String a = sc.next();
        // char로 변환함
        char result = a.charAt(0);
        // int로 숫자로 받음
        int str = (int)result;
        // 한글로 '가' 는 44031번이라서 이 숫자만큼 빼기
        System.out.println(str - 44031);
    }
}