import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] inputDate = sc.nextLine().split("-");
        int y = Integer.parseInt(inputDate[0]);
        int m = Integer.parseInt(inputDate[1]);
        int d = Integer.parseInt(inputDate[2]);
        
        int N = Integer.parseInt(sc.nextLine());
        
        d += N;
        m += (d - 1) / 30;
        d = (d - 1) % 30 + 1;
        y += (m - 1) / 12;
        m = (m - 1) % 12 + 1;
        
        System.out.printf("%d-%02d-%02d\n", y, m, d);
    }
}
