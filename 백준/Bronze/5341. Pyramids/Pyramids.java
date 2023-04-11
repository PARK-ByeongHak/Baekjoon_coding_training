import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
        	int a = sc.nextInt();
        	int sum=0;
        	if(a==0) {
        		break;
        	}
        	for(int i=a;i>0;i--) {
        		sum+=i;
        	}
        	System.out.println(sum);
        }
    }
}