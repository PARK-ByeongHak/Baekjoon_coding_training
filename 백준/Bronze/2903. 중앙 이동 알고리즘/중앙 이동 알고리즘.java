import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
		int N = sc.nextInt();	//시행 횟수
		
		int width = 3;
		int[] star = new int[16];
		for(int i=1; i<star.length; i++) {	//규칙에 따라 각 배열에 숫자 삽입
			star[i] = width * width;	//[0]=3*3, [1]=5*5, [2]=9*9, ...
			width = width + (width-1);	// 3, 5, 9, ...
		}
		
		System.out.println(star[N]);	//시행 횟수 번째의 값 출력
		
		
    }
}