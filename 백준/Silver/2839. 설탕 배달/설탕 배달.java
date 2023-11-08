import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0;
		while (true) {
			if(n==0) {
				break;
			}
			if(n==4||n==7) {
				cnt=-1;
				break;
			}
			if(n==3) {
				cnt++;
				n=0;
			}else if(n==6) {
				cnt+=2;
				n=0;
			}else if(n==9) {
				cnt+=3;
				n=0;
			}else if(n==12) {
				cnt+=4;
				n=0;
			}else {
				cnt++;
				n-=5;
			}
		}
		System.out.println(cnt);
	}
}