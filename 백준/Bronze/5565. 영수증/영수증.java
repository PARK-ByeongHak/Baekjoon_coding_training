import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt();
		for(int i=0;i<9;i++)
		{
			int n = sc.nextInt();
			max-=n;
		}
		System.out.println(max);
	}
}