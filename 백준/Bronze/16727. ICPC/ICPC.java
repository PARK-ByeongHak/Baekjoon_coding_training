import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	int a = sc.nextInt();// p1홈
    	int b = sc.nextInt();// s1원정
    	int c = sc.nextInt();// s2홈
    	int d = sc.nextInt();// p2원정
    	int ad=a+d, bc=b+c;
    	if(ad>bc) {
    		System.out.println("Persepolis");
    	}else if(ad<bc) {
    		System.out.println("Esteghlal");
    	}else if(ad==bc) {
    		if(d>b) {
        		System.out.println("Persepolis");
    		}else if(d<b) {
        		System.out.println("Esteghlal");
    		}else {
        		System.out.println("Penalty");
    		}
    	}
    }
}
