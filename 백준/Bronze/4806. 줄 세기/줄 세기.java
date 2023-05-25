import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            ans++;
        }

        System.out.println(ans);
    }
}