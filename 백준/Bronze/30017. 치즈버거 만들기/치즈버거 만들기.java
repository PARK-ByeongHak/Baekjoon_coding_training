import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=0, b=0;

        a = sc.nextInt();
        b = sc.nextInt();
        if(b+1>=a) {
        	System.out.println(a+a-1);
        }else {
        	System.out.println(b+b+1);
        }
        
    }
}