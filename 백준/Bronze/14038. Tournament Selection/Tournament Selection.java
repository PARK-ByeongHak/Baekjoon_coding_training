import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int cnt = 0;
    	for(int i=0; i<6; i++) {
        	String a = sc.next();
        	if(a.equals("W")) {
        		cnt++;
        	}
        }
    	if(cnt==0) {
    		System.out.println("-1");
    	}else if(cnt==1||cnt==2) {
    		System.out.println("3");
    	}else if(cnt==3||cnt==4) {
    		System.out.println("2");
    	}else if(cnt==5||cnt==6) {
    		System.out.println("1");
    	}
    }
}