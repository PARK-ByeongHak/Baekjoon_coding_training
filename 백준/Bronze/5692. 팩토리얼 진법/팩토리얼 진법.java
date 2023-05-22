import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
			int inputNum = sc.nextInt();
			int FBNum = 0;
			int count = 0;
			
			if(inputNum == 0)
				break;
			for(int i = inputNum ; i > 0; i /= 10) {
				int num = i % 10;
				FBNum += num * factorial(++count);
			}
			System.out.println(FBNum);
		}
	}

	private static int factorial(int count) { // 재귀함수로 팩토리얼 표현
		if(count == 1)
			return 1;
		return count * factorial(count - 1);
	}
}