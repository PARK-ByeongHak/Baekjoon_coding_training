import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        while(true) {
        	b-=c;
        	d-=a;
        	if(b>0&&d<=0) {
        		System.out.println("PLAYER A");
        		break;
        	}else if(d>0&&b<=0) {
        		System.out.println("PLAYER B");
        		break;
        	}else if(b<=0&&d<=0) {
        		System.out.println("DRAW");
        		break;
        	}
        }
        
	}
}