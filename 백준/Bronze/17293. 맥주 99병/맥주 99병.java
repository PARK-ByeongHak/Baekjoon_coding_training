import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n;

        while (n != 0) {
            if (n > 1) {
                if (n - 1 > 1) {
                    System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", n, n);
                    System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.%n", n - 1);
                } else {
                    System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", n, n);
                    System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
                }
            } else if (n == 1) {
                System.out.printf("%d bottle of beer on the wall, %d bottle of beer.%n", n, n);
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
            }
            System.out.println();
            n--;
        }

        if (first != 1) {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.printf("Go to the store and buy some more, %d bottles of beer on the wall.", first);
        } else {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.printf("Go to the store and buy some more, %d bottle of beer on the wall.", first);
        }
    }
}
