import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i=0;
        while(true) {
        	i++;
        	if(i*i==a) {// 완전 같을 경우
        		break;
        	}
        	if(i*i>a) {// 일정 길이 보다 모자라서 한번 더 돌고 오버 될 경우
        		i--;
        		break;
        	}
        }
        System.out.println("The largest square has side length "+i+".");
    }
}
