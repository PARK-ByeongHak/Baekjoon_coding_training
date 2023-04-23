import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i=0; i<t; i++) {
        	int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==b+c) {
                arr[i] = a*(b+c)*2;
            }else {
                arr[i] = a*(b+c);
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[t-1]);
    }
}
