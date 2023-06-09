import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            int price = 0;
            String name = "";
            int maxPrice = 0;
            String ans = "";

            int p = sc.nextInt();
            for (int i = 0; i < p; i++) {
                price = sc.nextInt();
                name = sc.next();

                if (price > maxPrice) {
                    maxPrice = price;
                    ans = name;
                }
            }
            System.out.println(ans);
        }
    }
}