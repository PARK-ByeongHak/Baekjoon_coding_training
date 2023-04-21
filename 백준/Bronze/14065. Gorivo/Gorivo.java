import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double GALLON2LITER = 3.785411784;
        double MILE2KM = 1.609344;
        double HUNDRED_KM = 100.00;

    	
    		System.out.printf("%.6f",100/(MILE2KM/GALLON2LITER*a));
    	
    	
    }
}
