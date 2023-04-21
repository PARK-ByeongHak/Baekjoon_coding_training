import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int min1 = Math.min(a*4+b*2, a*2+c*2);
    	int min2 = Math.min(min1, b*2+c*4);
    	System.out.println(min2);
    	
    }
}
