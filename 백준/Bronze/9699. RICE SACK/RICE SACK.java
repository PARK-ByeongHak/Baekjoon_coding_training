import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
        	int[] rice = new int[5];
        	int max=0;
        	for(int j=0; j<5; j++) {
        		rice[j] = sc.nextInt();
        		if(max<rice[j]) {
        			max=rice[j];
        		}
        	}
        	System.out.println("Case #"+i+": "+max);
        }
        
    }
}