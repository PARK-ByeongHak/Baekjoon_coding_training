import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++) {
        	long a = sc.nextLong();
        	long b = sc.nextLong();
        	long c = sc.nextLong();
        	long d = sc.nextLong();
        	
        	if(a*b>c*d) {
        		System.out.println("TelecomParisTech");
        	}else if(a*b<c*d) {
        		System.out.println("Eurecom");
        	}else {
        		System.out.println("Tie");
        	}
        }
    }
}