import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println(5*a-400);
		if(a>100) {
			System.out.println("-1");
		}else if(a<100) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
}