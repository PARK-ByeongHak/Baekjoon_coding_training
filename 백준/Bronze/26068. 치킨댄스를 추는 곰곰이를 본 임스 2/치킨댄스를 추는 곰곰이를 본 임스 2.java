import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int cnt=0;
    	for(int i=0; i<a;i++) {
    		String str = sc.next();
    		String intstr = str.replaceAll("[^0-9]", "");
    		if(Integer.parseInt(intstr)<=90) {
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    }
}