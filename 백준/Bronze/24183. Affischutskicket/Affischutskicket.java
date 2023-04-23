import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        double c4 = sc.nextDouble();
        double a3 = sc.nextDouble();
        double a4 = sc.nextDouble();
        double envelop = 229 * 324 * c4 * 2;
        double poster = 297 * 420 * a3 * 2;
        double sheet = 210 * 297 * a4;
        
        System.out.printf("%.6f", (envelop + poster + sheet) * 0.000001);
    }
}
