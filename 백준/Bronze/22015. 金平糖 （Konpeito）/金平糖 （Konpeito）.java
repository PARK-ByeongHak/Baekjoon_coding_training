import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();

    	int max1 = Math.max(a, b);
    	int max2 = Math.max(a, c);
    	int max3 = Math.max(c, b);
    	int max4 = Math.max(max1, max2);
    	int max5 = Math.max(max2, max3);
    	int max = Math.max(max4, max5);
    	
    	System.out.println((max-a)+(max-b)+(max-c));
    }
}
