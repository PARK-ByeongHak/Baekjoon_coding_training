import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    	int a = sc.nextInt();
    	System.out.println((int)(a-(a*0.22))+" "+(int)(a-(a*0.2*0.22)));
    }
}