import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String str = input[0];
            int start = Integer.parseInt(input[1]);
            int end = Integer.parseInt(input[2]);
            String result = str.substring(0, start) + str.substring(end);
            System.out.println(result);
        }
    }
}