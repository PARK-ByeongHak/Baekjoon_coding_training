import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int n = sc.nextInt();
        	if(n==0) {
        		break;
        	}
            int sum =0;
            for(int j=1; j<=n; j++) {
            	sum+=j*j;
            }
            System.out.println(sum);
        }
    }
}