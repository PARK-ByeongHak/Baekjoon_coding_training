import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long L = sc.nextLong(); // 아르킵과 브로니슬라프이 짜낸 모든 우유의 양
        long T = sc.nextLong(); // 우유가 들어가는 시간

        System.out.println(2*T-L);
    }
}