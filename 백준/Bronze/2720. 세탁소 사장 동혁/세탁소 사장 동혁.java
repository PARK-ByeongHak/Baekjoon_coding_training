import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
		int N = sc.nextInt();	//몇번 거슬러줘야하는지 확인
		
		for (int i = 0; i < N; i++) {
			
			int cash = sc.nextInt();
			int Quarter=0, Dime=0, Nickel=0, Penny=0;	//새로 값을 받을 때 마다 카운트 초기화
			
			while(cash!=0) {			//cash가 0이 될 때 까지 반복
				if(cash>=25) {
					Quarter++;
					cash -= 25;
				}else if(cash>=10) {
					Dime++;
					cash -= 10;
				}else if(cash>=5) {
					Nickel++;
					cash -= 5;
				}else if(cash>=1) {
					Penny++;
					cash -= 1;
				}
			}
			System.out.println(Quarter+" "+Dime+" "+Nickel+" "+Penny);	//카운트한 동전 갯수 출력
		}
		
		
    }
}