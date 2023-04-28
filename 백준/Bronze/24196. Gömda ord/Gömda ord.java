import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int index = 0;
        String result = "";
        while (index < input.length() - 1) {
            result += input.charAt(index);
            index += (int)(input.charAt(index) - 'A') + 1;
        }
        result += input.charAt(index);
        System.out.println(result);
    }
}
