import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        int x = sc.nextInt();
        int k = sc.nextInt();
        
        if (k*7 <= x) {// 만들 수 있는 눈사람의 가장 큰 눈덩이의 부피는 7이므로, k*7가 x 이하일 때
            System.out.println(k*7000);
        } else if (k*3.5 <= x) {// 만들 수 있는 눈사람의 두 번째 눈덩이의 부피는 3.5이므로, k*3.5가 x 이하일 때
            System.out.println(k*3500);
        } else if (k*1.75 <= x) {// 만들 수 있는 눈사람의 세 번째 눈덩이의 부피는 1.75이므로, k*1.75가 x 이하일 때
            System.out.println(k*1750);
        } else {// 그 외의 경우
            System.out.println(0);
        }

	}
}