import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int ans=0;
			for(int i=0;i<n;i++)
				ans+=sc.nextInt()/k;
			System.out.println(ans);
		}
	}	
}