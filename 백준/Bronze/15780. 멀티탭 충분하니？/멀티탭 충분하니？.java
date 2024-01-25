import java.util.Scanner;

public class Main {
    public static int check(int num) {
        int result = 0;
        if (num % 2 == 0) {
            result = num / 2;
        } else if (num % 2 != 0) {
            result = num / 2 + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multi, people, hole;

        people = scanner.nextInt();
        multi = scanner.nextInt();

        int pass = people;

        for (int i = 0; i < multi; i++) {
            hole = scanner.nextInt();
            pass -= check(hole);
        }

        if (pass <= 0) {
            System.out.println("YES");
        } else if (pass > 0) {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
