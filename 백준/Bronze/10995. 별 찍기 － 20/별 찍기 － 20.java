import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
        	if(i%2!=0) {
        		System.out.print(" ");
        	}
        	for(int j=0; j < N; j++) {
            	System.out.print("*");
            	if(j+1!=N) {
            		System.out.print(" ");
            	}
            }
        	if(i+1!=N) {
        		System.out.println();
        	}
        }
        
	}
}