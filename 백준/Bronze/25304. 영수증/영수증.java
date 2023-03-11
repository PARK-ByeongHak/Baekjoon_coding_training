import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int  price, ea, count, sum, price_All=0;
        
        sum = sc.nextInt();
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
			price = sc.nextInt();
			ea = sc.nextInt();
			price_All+=(price*ea);
		}
        if (sum==price_All) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}   
}
