import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();// 원하는 높이
        int a = sc.nextInt();// 기본 가격 높이
        int b = sc.nextInt();// 추가 가격 높이
        int yen = 250;// 아이스크림 구매 기본값
        int ans = a;
        while(ans<c) {
        	ans+=b;
        	yen+=100;
        }
        System.out.println(yen);
    }
}
