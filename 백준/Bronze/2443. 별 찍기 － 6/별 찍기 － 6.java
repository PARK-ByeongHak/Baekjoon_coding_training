import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){	// 1 ~ N
        	for(int j = 0; j < i; j++) {	// 공백
        		System.out.print(" ");
        	}
            
        	for(int k = 0; k < (2 * n - 1) - (2 * i); k++){	// 별
        		System.out.print("*");
        	}
    		if(i+1!=n) {
    			System.out.println();
    		}
        }
        
    }
}
