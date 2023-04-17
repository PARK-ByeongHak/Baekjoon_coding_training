import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int cnt = sc.nextInt();
        int ans = 0;
        for(int i=0; i<cnt; i++) {
        	String str = sc.next();
        	if(str.equals(a)) {
        		ans++;
        	}
        }
        System.out.println(ans);
    }
}