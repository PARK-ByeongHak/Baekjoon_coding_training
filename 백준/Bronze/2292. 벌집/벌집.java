import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
		int N = sc.nextInt();	//도착 목표 방
		int room = 1, run = 2;
		if(N==1) {
			System.out.println(1);
		}else {
			while (run <= N) {	// 범위가 N보다 커지기 직전까지 반복 
				run = run + (6 * room);	// 다음 범위의 최솟값으로 초기화 
				room++;	// room 1 증가 
			}
			System.out.print(room);
		}
    }
}