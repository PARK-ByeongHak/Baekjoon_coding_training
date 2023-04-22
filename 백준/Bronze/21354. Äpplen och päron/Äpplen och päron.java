import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a*7>b*13) {// 사과 판매값이 더 높을 경우
        	System.out.println("Axel");
        }else if(a*7<b*13) {// 배 판매값이 더 높을 경우
        	System.out.println("Petra");
        }else {// 같을 경우
        	System.out.println("lika");
        }
    }
}
