import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가로, 세로 길이 입력 받기
        long x = sc.nextLong();
        long y = sc.nextLong();
        // 가로1, 세로2 또는 가로2, 세로1 의 타일의 크기는 2이므로 전체 넓이의 절반이 정답.
        System.out.println(x * y / 2);
    }
}