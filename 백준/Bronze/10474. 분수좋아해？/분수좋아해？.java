import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int num = sc.nextInt(); //분자
			int den = sc.nextInt(); //분모
			
			if(num == 0 && den == 0)
				break;
			
			System.out.println(num/den+ " " +num%den+ " / " + den);
		}
		
	}
}
