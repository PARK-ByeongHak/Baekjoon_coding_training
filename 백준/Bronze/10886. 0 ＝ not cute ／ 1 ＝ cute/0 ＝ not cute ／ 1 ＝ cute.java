import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int notCute=0, cute=0;
        for (int i = 1; i <= n; i++)
        {
            int N = sc.nextInt();
            if(N==1) {
            	cute++;
            }else if(N==0) {
            	notCute++;
            }
        }
        if(notCute>cute) {
        	System.out.println("Junhee is not cute!");
        }else {
        	System.out.println("Junhee is cute!");
        }
	}
}