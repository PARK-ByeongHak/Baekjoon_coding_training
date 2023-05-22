import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수
        int sum=0;
        for (int t = 1; t <= T; t++) {
            if(T%t==0) {
            	sum+=t;// 약수일 경우 sum에 값 추가
            }
        }
        System.out.println(sum*5-24);// 광고차단을 꺼야 보이는 숨겨진 조건
    }
}