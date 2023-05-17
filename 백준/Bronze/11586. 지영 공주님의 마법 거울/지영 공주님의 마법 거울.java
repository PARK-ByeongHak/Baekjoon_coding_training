import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] array = new String[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.next();
		}
		int a = sc.nextInt();
		if(a==1) {
			for(int i=0; i<n; i++) {
				System.out.println(array[i]);
			}
		}else if(a==2) {
			
			for(int i=0; i<n; i++) {
				String[] rearray = array[i].split("");
				for(int j=n-1; j>=0;j--) {
					System.out.print(rearray[j]);
				}
				System.out.println();
			}
		}else if(a==3) {
			for(int i=n-1; i>=0; i--) {
				System.out.println(array[i]);
			}
		}
	}
}