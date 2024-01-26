import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int redApple = scan.nextInt();
		int greenApple = scan.nextInt();
		int player = 1;
		//선수의 수 초기 값 1명 부터 시작
		
		while(player <= redApple || player <= greenApple) {
			//선수가 둘의 사과중 적은 사과의 갯수보다 작거나 같을때까지만 반복
			if(redApple % player == 0 && greenApple % player == 0) {
				System.out.println(player + " " + redApple / player + " " +  greenApple / player);
			//공평하게 나누기 위해서 사과를 선수수로 나누었을때 0의 값이 나와야함
			}
			player++;
			//선수를 한명씩 추가해서 비교해봄
		}
    }
}