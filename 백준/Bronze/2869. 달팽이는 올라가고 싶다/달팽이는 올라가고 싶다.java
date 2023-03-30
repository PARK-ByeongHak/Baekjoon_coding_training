import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

		int up = sc.nextInt();			//올라가는 높이
		int down = sc.nextInt();		//미끄러지는 높이
		int score = sc.nextInt();		//목표
		
		int day = (score - down) / (up - down);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((score - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
    }
}