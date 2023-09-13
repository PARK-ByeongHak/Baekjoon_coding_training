import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = a%14;
        switch (cnt) {
        case 1:
			System.out.println("W");
			break;
        case 2:
			System.out.println("e");
			break;
        case 3:
        	System.out.println("l");
			break;
        case 4:
        	System.out.println("c");
			break;
        case 5:
        	System.out.println("o");
			break;
        case 6:
        	System.out.println("m");
			break;
        case 7:
        	System.out.println("e");
			break;
        case 8:
        	System.out.println("T");
			break;
        case 9:
        	System.out.println("o");
			break;
        case 10:
        	System.out.println("S");
			break;
        case 11:
        	System.out.println("M");
			break;
        case 12:
        	System.out.println("U");
			break;
        case 13:
        	System.out.println("P");
			break;
        case 0:
        	System.out.println("C");
			break;
		}
    }
}