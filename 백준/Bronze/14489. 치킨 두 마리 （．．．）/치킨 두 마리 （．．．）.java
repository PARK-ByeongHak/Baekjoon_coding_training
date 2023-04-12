import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a+b)>=(c*2)) {	// 치킨을 사줄 돈이 된다면(두 통장 잔고의 합이 치킨 2마리 값보다 크거나 같으면)
        	System.out.println((a+b)-(c*2));
        }else {				// 안 될 경우
        	System.out.println(a+b);
        }
    }
}