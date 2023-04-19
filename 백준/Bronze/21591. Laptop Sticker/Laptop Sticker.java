import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double w1=sc.nextDouble();
		double h1=sc.nextDouble();
		double w2=sc.nextDouble();
		double h2=sc.nextDouble();
		if(w1>=w2+2&&h1>=h2+2) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}