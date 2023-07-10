import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        if (line.charAt(0) == line.charAt(1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}