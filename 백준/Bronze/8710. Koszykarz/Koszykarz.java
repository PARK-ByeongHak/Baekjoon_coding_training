import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int cnt = 0;
    	while(a<b) {
    		a+=c;
    		cnt++;
    	}
    	System.out.println(cnt);
    }
}