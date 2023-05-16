import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 변수 입력 받기
		int N = sc.nextInt();
		int count = 0;
		int check = 0;
		// 반복문
		for(int i=0; i<=N; i++) {
			check = i;
            // 숫자가 3이나 6 또는 9일 경우 카운트 추가
			while(check != 0) {
				if(check%10 == 3 || check%10 == 6 || check%10 == 9) 
					count ++;
				check /= 10;
			}
		}
		System.out.println(count);
	}
}

