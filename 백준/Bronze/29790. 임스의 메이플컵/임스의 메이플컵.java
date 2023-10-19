import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=0, b=0, c=0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>=1000 && (b>=8000 || c>=260)) {
        	System.out.println("Very Good");
        }else if(a>=1000) {
        	System.out.println("Good");
        }else {
        	System.out.println("Bad");
        }
    }
}