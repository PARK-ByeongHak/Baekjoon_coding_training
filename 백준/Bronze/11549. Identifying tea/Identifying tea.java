import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[] ans = new int[5];
        int cnt=0;
        for(int i=0; i<ans.length; i++) {
        	ans[i] = sc.nextInt();
        	if(ans[i]==a) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
    }
}