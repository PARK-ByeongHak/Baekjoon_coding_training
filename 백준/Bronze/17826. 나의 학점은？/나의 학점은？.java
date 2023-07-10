import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		
		int [] arr =new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int score = sc.nextInt();
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==score) {
				num=i+1;
				break;
			}
		}
		if (num<=5) {
			System.out.println("A+");
		}else if (num<=15) {
			System.out.println("A0");
		}else if (num<=30) {
			System.out.println("B+");
		}else if (num<=35) {
			System.out.println("B0");
		}else if (num<=45) {
			System.out.println("C+");
		}else if (num<=48) {
			System.out.println("C0");
		}else {
			System.out.println("F");
		}
	}
}