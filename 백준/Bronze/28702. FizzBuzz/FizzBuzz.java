import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ans = 0;
        for (int i : new int[]{3, 2, 1}) {
            String tmp = scanner.nextLine().trim();

            if (!tmp.equals("Fizz") && !tmp.equals("Buzz") && !tmp.equals("FizzBuzz")) {
                ans = Integer.parseInt(tmp) + i;
            }
        }

        if (ans % 3 == 0 && ans % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (ans % 3 == 0) {
            System.out.println("Fizz");
        } else if (ans % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(ans);
        }
    }
}
