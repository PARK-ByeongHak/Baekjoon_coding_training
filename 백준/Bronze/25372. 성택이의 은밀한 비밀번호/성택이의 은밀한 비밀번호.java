import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	for(int i=0; i<num; i++) {
    		String password = sc.next();
    		
    		if(password.length()<6||password.length()>9) {
    			System.out.println("no");
    		}else {
    			System.out.println("yes");
    		}
    	}
    }
}