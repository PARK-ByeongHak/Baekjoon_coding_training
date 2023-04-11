import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++) {
        	System.out.println(" @@@   @@@ ");
        	System.out.println("@   @ @   @");
        	System.out.println("@    @    @");
        	System.out.println("@         @");
        	System.out.println(" @       @ ");
        	System.out.println("  @     @  ");
        	System.out.println("   @   @   ");
        	System.out.println("    @ @    ");
        	System.out.print("     @     ");
        	if(i<cnt-1) {
        		System.out.println();
        	}
        }
        
    }
}