import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int turn = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int nowidx = 0;
		int cnt = 0;
		
		for(int i=1; i<=turn; i++) {
			int now = sc.nextInt();
			nowidx+=now;
			if(nowidx>=size-1) {
				cnt = i;
				break;
			}
			
			int gomore = arr[nowidx];
			nowidx+=gomore;
			if(nowidx>=size-1) {
				cnt = i;
				break;
			}
		}
		System.out.println(cnt);

	}

}