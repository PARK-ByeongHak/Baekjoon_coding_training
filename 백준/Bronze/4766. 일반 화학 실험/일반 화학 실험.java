import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        double temp=0;
        while(true) {
        	double a = sc.nextDouble();
        	if(a==999) {
        		break;
        	}
        	if(cnt==0) {
        		temp=a;
        		cnt++;
        	}else {
        		System.out.printf("%.2f\n",a-temp);
        		temp=a;
        		cnt++;
        	}
        }
    }
}