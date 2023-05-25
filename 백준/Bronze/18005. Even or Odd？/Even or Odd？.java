import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2!=0) {
			System.out.println("0");
		}else {
			if((num/2)%2==0) {
				System.out.println("2");
			}else {
				System.out.println("1");
			}
		}
	}
}