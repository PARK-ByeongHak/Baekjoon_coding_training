import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int cnt=0;
        int T = sc.nextInt();
        for(int i=1; i<=T; i++) {
        	int a = sc.nextInt();
            if(a!=i) {
            	cnt++;
            }
        }
        System.out.println(cnt);
	}
}