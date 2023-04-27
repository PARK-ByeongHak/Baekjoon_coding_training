import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String answer = str.replace("a", "4")
                          .replace("e", "3")
                          .replace("i", "1")
                          .replace("o", "0")
                          .replace("s", "5");
        System.out.println(answer);
    }
}