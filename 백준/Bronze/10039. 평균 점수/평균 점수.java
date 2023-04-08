import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int avg = 0;
    	for(int i=0;i<5;i++) {
    		int a = sc.nextInt();
    		if(a<40) {
    			a=40;
    		}
    		avg+=a;
    	}
    	System.out.println(avg/5);
    }
}