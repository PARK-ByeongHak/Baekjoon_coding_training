import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] str = n.split("");
       
        for (int i = 0; i <= str.length; i++) {
            switch (str[i]) {
			case "0":
				System.out.println("0000");
				System.out.println("0  0");
				System.out.println("0  0");
				System.out.println("0  0");
				System.out.println("0000");
				break;
			case "1":
				System.out.println("   1");
				System.out.println("   1");
				System.out.println("   1");
				System.out.println("   1");
				System.out.println("   1");
				break;
			case "2":
				System.out.println("2222");
				System.out.println("   2");
				System.out.println("2222");
				System.out.println("2");
				System.out.println("2222");
				break;
			case "3":
				System.out.println("3333");
				System.out.println("   3");
				System.out.println("3333");
				System.out.println("   3");
				System.out.println("3333");
				break;
			case "4":
				System.out.println("4  4");
				System.out.println("4  4");
				System.out.println("4444");
				System.out.println("   4");
				System.out.println("   4");
				break;
			case "5":
				System.out.println("5555");
				System.out.println("5");
				System.out.println("5555");
				System.out.println("   5");
				System.out.println("5555");
				break;
			case "6":
				System.out.println("6666");
				System.out.println("6");
				System.out.println("6666");
				System.out.println("6  6");
				System.out.println("6666");
				break;
			case "7":
				System.out.println("7777");
				System.out.println("   7");
				System.out.println("   7");
				System.out.println("   7");
				System.out.println("   7");
				break;
			case "8":
				System.out.println("8888");
				System.out.println("8  8");
				System.out.println("8888");
				System.out.println("8  8");
				System.out.println("8888");
				break;
			case "9":
				System.out.println("9999");
				System.out.println("9  9");
				System.out.println("9999");
				System.out.println("   9");
				System.out.println("   9");
				break;
			}
            if(i+1==str.length) {
            	break;
            }else {
            	System.out.println();
            }
        }
    }
}
