import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			// 문자열로 입력 받아서 배열에 숫자를 하나씩 삽입
			String[] arr=sc.next().split("");
			// 배열의 제일 마지막 숫자를 정수화 하여 2로 나눈 나머지가 0인지(짝수인지) 판별하여 출력
			System.out.println(Integer.parseInt(arr[arr.length-1])%2==0?"even":"odd");
		}
	}
}