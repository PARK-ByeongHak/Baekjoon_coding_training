import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+(b*2)+(c*3)>=10) {
        	System.out.println("happy");
        }else {
        	System.out.println("sad");
        }
    }
}