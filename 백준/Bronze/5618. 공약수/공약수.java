import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String num = kb.nextLine();
		String inputs = kb.nextLine();
		int min = 100000000;
        
		String[] strArr = inputs.split(" ");
		int len = strArr.length;

		for(int i =0; i<len; i++) {
				if(Integer.parseInt(strArr[i]) <min) {
					min = Integer.parseInt(strArr[i]) ;
				}
		}
		switch(len) {
		case 2: 
			for(int n=1; n<=min; n++) {
				if(Integer.parseInt(strArr[0]) % n == 0 && Integer.parseInt(strArr[1]) %n == 0) {
					System.out.println(n);
				}
			}
			break;
		case 3:
			for(int n=1; n<=min; n++) {
				if(Integer.parseInt(strArr[0]) % n == 0 && Integer.parseInt(strArr[1]) %n == 0 && Integer.parseInt(strArr[2]) %n == 0) {
					System.out.println(n);
				}
			}
			break;
		}
	}
}