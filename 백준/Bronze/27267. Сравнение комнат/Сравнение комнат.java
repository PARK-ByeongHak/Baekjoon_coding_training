import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Maša 방의 가로 길이
        int b = sc.nextInt(); // Maša 방의 세로 길이
        int c = sc.nextInt(); // Petja 방의 가로 길이
        int d = sc.nextInt(); // Petja 방의 세로 길이
        
        int mashaArea = a * b; // Maša 방의 면적 계산
        int petjaArea = c * d; // Petja 방의 면적 계산
        
        if (mashaArea > petjaArea) {
            System.out.println("M"); // Maša 방이 더 큰 경우
        } else if (mashaArea < petjaArea) {
            System.out.println("P"); // Petja 방이 더 큰 경우
        } else {
            System.out.println("E"); // 두 방의 면적이 같은 경우
        }
        sc.close();
    }
}
