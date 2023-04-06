import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int min = 0;
    	while(true) {
    		if(n < 5&& n > 0) {
    			n=0;
    			min++;
    			break;
    		}else if(n == 0) {
    			break;
    		}
    		n-=5;
    		min++;
    	}
    	System.out.println(min);
    }
}