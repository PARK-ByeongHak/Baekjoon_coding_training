import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int def = sc.nextInt();
    	int penetrate = sc.nextInt();
    	if(def*(100-penetrate)/100 < 100) {
    		System.out.println("1");
    	}else {
    		System.out.println("0");
    	}
    }
}