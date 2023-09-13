import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        // 카운트 선언
        int cnt = 0;
        // A부터 B까지 반복
        for(int i=a;i<=b;i++) {
            // 범위에 해당하면 카운트추가
        	if(i<=k+x&&i>=k-x) {
        		cnt++;
        	}
        }
        // 출력
        if(cnt==0) {
        	System.out.println("IMPOSSIBLE");
        }else {
        	System.out.println(cnt);
        }
    }
}