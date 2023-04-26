import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int t = 0; t < n; t++) {
        	int i = sc.nextInt();
            int f = sc.nextInt();
            if((i<=2&&f<=1)||(i<=1&&f<=2)) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
        }
    }
}
