import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int a=0, b=0, c=0;
		
		if(num1<num2&&num2<num3) {
			a=num1;
			b=num2;
			c=num3;
		}else if(num3<num2&&num2<num1) {
			a=num3;
			b=num2;
			c=num1;
		}else if(num2<num1&&num1<num3) {
			a=num2;
			b=num1;
			c=num3;
		}else if(num3<num1&&num1<num2) {
			a=num3;
			b=num1;
			c=num2;
		}else if(num1<num3&&num3<num2) {
			a=num1;
			b=num3;
			c=num2;
		}else if(num2<num3&&num3<num1) {
			a=num2;
			b=num3;
			c=num1;
		}
		String str = sc.next();
		if(str.equals("ABC")) {
			System.out.println(a+" "+b+" "+c);
		}else if(str.equals("CBA")) {
			System.out.println(c+" "+b+" "+a);
		}else if(str.equals("BAC")) {
			System.out.println(b+" "+a+" "+c);
		}else if(str.equals("CAB")) {
			System.out.println(c+" "+a+" "+b);
		}else if(str.equals("ACB")) {
			System.out.println(a+" "+c+" "+b);
		}else if(str.equals("BCA")) {
			System.out.println(b+" "+c+" "+a);
		}
	}
}