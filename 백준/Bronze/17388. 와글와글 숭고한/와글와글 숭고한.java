import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x+y+z>=100) {
        	System.out.println("OK");
        }else {
        	if(x<y&&x<z) {
        		System.out.println("Soongsil");
        	}else if(y<x&&y<z) {
        		System.out.println("Korea");
        	}else if(z<x&&z<y) {
        		System.out.println("Hanyang");
        	}
        }
    }
}