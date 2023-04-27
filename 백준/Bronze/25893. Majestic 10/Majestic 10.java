import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of players
        for (int i = 0; i < n; i++) {
            int stat1 = sc.nextInt();
            int stat2 = sc.nextInt();
            int stat3 = sc.nextInt();
            System.out.println(stat1 + " " + stat2 + " " + stat3);
            int doubles = 0;
            if (stat1 >= 10) {
                doubles++;
            }
            if (stat2 >= 10) {
                doubles++;
            }
            if (stat3 >= 10) {
                doubles++;
            }
            if (doubles == 0) {
                System.out.println("zilch");
            } else if (doubles == 1) {
                System.out.println("double");
            } else if (doubles == 2) {
                System.out.println("double-double");
            } else {
                System.out.println("triple-double");
            }
            System.out.println();
        }
        sc.close();
    }
}