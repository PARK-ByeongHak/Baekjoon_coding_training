import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	int a = sc.nextInt();
    	if(a==2006) {
    		System.out.println("PetrSU, ITMO");
    	}else if(a==1996||a==1997||a==2000||a==2007||a==2008||a==2013||a==2018) {
    		System.out.println("SPbSU");
    	}else {
    		System.out.println("ITMO");
    	}
    	
    }
}
