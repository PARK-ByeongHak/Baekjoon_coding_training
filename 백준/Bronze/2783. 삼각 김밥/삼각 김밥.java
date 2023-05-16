import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int ngram = sc.nextInt();
        int nprice = sc.nextInt();
        double aprice = (double)ngram/nprice*1000;
        
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
        	int mgram = sc.nextInt();
            int mprice = sc.nextInt();
            double bprice = (double)mgram/mprice*1000;
            aprice = Math.min(aprice, bprice);
        }
        System.out.printf("%.2f",aprice);
	}
}