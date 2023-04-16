import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b-a>30) {
        	System.out.println("You are speeding and your fine is $500.");
        }else if(b-a>20&&b-a<=30) {
        	System.out.println("You are speeding and your fine is $270.");
        }else if(b-a>0&&b-a<=20) {
        	System.out.println("You are speeding and your fine is $100.");
        }else {
        	System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}