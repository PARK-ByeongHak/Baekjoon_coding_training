import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] ans = new int[3];
    	ans[0] = sc.nextInt();
    	ans[1] = sc.nextInt();
    	ans[2] = sc.nextInt();
    	Arrays.sort(ans);
    	System.out.println(ans[1]+ans[2]);
    }
}