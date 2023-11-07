import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스 수
        
        for (int t = 0; t < T; t++) {
            int k = sc.nextInt(); // 층수
            int n = sc.nextInt(); // 호수
            
            int[][] apt = new int[15][15]; // 아파트 정보 배열
            
            // 0층 초기화
            for (int i = 1; i <= 14; i++) {
                apt[0][i] = i;
            }
            
            // 아파트 거주민 수 계산
            for (int i = 1; i <= 14; i++) {
                for (int j = 1; j <= 14; j++) {
                    apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
                }
            }
            
            System.out.println(apt[k][n]);
        }
        
    }
}