import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] times = new int[N];
        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();
            sum += times[i];
        }
        
        int time = sum + (N - 1) * 8;
        int days = time / 24;
        int hours = time % 24;
        
        System.out.println(days + " " + hours);
    }
}
