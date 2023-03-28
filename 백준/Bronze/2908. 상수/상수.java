import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			String text = sc.nextLine();
			String[] str = text.split(" ");
			String[] Num1 = str[0].split("");
			String[] Num2 = str[1].split("");
			String num1 = "", num2 = "";
			for(int i=Num1.length-1; i>=0; i--) {
				num1+=Num1[i];
				num2+=Num2[i];
			}
			if(Integer.parseInt(num1)>Integer.parseInt(num2)) {
				System.out.println(num1);
			}else {
				System.out.println(num2);
			}
		
	}	
}