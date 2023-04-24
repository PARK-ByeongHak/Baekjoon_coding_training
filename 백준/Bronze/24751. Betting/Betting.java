import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double t = sc.nextInt();
    	System.out.printf("%.10f\n%.10f",100/(t),100/(100-t));
    }
}