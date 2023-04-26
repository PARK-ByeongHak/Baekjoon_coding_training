import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 팀 멤버 수
        int d = sc.nextInt(); // 상금 총액
        
        int totalProblems = 0; // 총 문제 수
        int[] problems = new int[n]; // 각 팀 멤버의 문제 수
        
        // 각 팀 멤버의 문제 수 입력받기
        for (int i = 0; i < n; i++) {
            problems[i] = sc.nextInt();
            totalProblems += problems[i];
        }
        
        // 각 팀 멤버의 상금 계산하여 출력
        for (int i = 0; i < n; i++) {
            int reward = (int) ((double) d / totalProblems * problems[i]); // 상금 계산
            System.out.println(reward);
        }
    }
}
