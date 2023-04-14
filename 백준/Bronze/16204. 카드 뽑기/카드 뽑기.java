import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //변수 입력 받음
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        // 앞면이 o인 m과 뒷면이 o인 k 중 작은 수와
        // 앞면 나머지가 x인 n-m과 뒷면 나머지가 x인 n-k 중 작은수 를 합침
        int cnt = Math.min(m, k) + Math.min(n-m, n-k);
        System.out.println(cnt);
    }
}