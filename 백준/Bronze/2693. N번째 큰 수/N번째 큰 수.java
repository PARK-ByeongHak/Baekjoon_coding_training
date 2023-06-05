import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
        	int[] a = new int[10];
        	for(int j=0; j<10; j++) {
        		a[j] = sc.nextInt();
        	}
        	Arrays.sort(a);
        	System.out.println(a[7]);
        }
        
    }
}