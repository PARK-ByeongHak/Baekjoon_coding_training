import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> list = new ArrayList<>(Arrays.asList('1', '0', '0')); // 1

        String str = scanner.next(); // 2

        for (int i = 0; i < str.length(); i++) { // 3
            if (str.charAt(i) == 'A') {
                Collections.swap(list, 0, 1);
            } else if (str.charAt(i) == 'B') {
                Collections.swap(list, 1, 2);
            } else {
                Collections.swap(list, 0, 2);
            }
        }
        System.out.println(list.indexOf('1') + 1); // 4
    }
}