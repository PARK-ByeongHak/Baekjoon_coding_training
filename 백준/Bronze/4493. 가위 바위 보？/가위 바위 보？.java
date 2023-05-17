import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			int p1=0;
			int p2=0;
			for(int j=0; j<m;j++) {
				String a = sc.next();
				String b = sc.next();
				if(a.equals("R")&&b.equals("P")||a.equals("P")&&b.equals("S")||a.equals("S")&&b.equals("R")) {
					p2++;
				}else if(a.equals("P")&&b.equals("R")||a.equals("S")&&b.equals("P")||a.equals("R")&&b.equals("S")) {
					p1++;
				}
			}
			if(p1>p2) {
				System.out.println("Player 1");
			}else if(p1<p2) {
				System.out.println("Player 2");
			}else {
				System.out.println("TIE");
			}
		}
		
	}
}