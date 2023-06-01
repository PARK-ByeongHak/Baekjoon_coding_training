import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum=0;
		int len=s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String a = Integer.toBinaryString(s.charAt(i)-'0');
			if(a.length()==2 && i!=0) a="0"+a;
			else if(a.length()==1 && i!=0) a="00"+a;
			
			sb.append(a);
		}
		System.out.println(sb);
	}
}