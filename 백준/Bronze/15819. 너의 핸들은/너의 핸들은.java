import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 핸들의 개수
        int I = scanner.nextInt(); // 사전 순으로 I번째인 핸들
        
        String[] handles = new String[N];
        for (int i = 0; i < N; i++) {
            handles[i] = scanner.next();
        }
        
        Arrays.sort(handles); // 핸들 목록을 사전 순으로 정렬
        
        // 사전 순으로 I번째인 핸들 출력
        System.out.println(handles[I - 1]);
        
        scanner.close();
    }
}
