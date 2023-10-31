import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int income = sc.nextInt();
		while (income != 0) {
			if (income <= 1000000) {
				System.out.println(income);
			} else if (income <= 5000000) {
				System.out.println((int)(income * 0.9));
			} else {
				System.out.println((int)(income * 0.8));
			}
			
			income = sc.nextInt();
		}
	}
}