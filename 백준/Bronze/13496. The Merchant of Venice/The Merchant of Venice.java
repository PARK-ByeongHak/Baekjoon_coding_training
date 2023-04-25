import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int d = sc.nextInt();
            int ans = 0;
            for(int j = 0, a, b; j < n; j++){
                a = sc.nextInt();
                b = sc.nextInt();
                if(s * d >= a) ans += b;
            }
            System.out.println("Data Set " + i + ":\n" + ans + "\n");
        }
    }
}