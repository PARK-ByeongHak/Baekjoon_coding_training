import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int num[] = new int[n];
    	int startnum = 0;
    	boolean down=false;
    	String str = "YES";
    	for(int i=0; i<n; i++) {
    		num[i] = sc.nextInt();
    		if(num[i]>startnum) {
    			if(down) {
    				str = "NO";
    			}else {
    				startnum = num[i];
    			}
    		}else if(num[i]<startnum) {
    			down = true;
				startnum = num[i];
    		}else {
				str = "NO";
    		}
    	}
    	System.out.println(str);
    }
}