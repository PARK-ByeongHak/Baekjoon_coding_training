import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int W = sc.nextInt();
    	int H = sc.nextInt();

    	int x_min = Math.min(A, W-A);
    	int y_min = Math.min(B, H-B);
    	
    	System.out.println(Math.min(x_min, y_min));
    }
}