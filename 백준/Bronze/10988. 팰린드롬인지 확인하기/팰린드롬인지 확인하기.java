import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String[] temp = str1.split("");
		String str2 = "";
		for(int i=temp.length-1; i>=0; i--) {
			str2 += temp[i];
		}
		if(str1.contentEquals(str2)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}