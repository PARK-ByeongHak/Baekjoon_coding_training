import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		String[]restr = str.split("");
		int cnt2 = 0, cntE = 0;
		for(int i=0;i<num;i++)
		{
			if(restr[i].equals("2")) {
				cnt2++;
			}else {
				cntE++;
			}
		}
		if(cnt2>cntE) {
			System.out.println("2");
		}else if(cntE>cnt2) {
			System.out.println("e");
		}else {
			System.out.println("yee");
		}
	}
}