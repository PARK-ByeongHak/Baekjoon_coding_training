import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(); // 가로 길이 입력
        int width = sc.nextInt(); // 세로 길이 입력
        int area = length * width; // 면적 계산
        int bags = (int) Math.ceil(area / (5.0 * 4840)); // 필요한 씨앗의 양 계산
        System.out.println(bags); // 필요한 씨앗의 양 출력
        sc.close();
    }
}
