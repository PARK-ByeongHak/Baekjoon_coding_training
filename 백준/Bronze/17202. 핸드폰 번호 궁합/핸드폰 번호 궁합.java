import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Integer[] arr = new Integer[16];
        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {
                arr[i] = Integer.valueOf(a.charAt(i / 2) + "");
            } else {
                arr[i] = Integer.valueOf(b.charAt(i / 2) + "");
            }
        }
        List<Integer> list = Arrays.asList(arr);
        while (list.size() > 2) {
            List<Integer> temp = new ArrayList<>();
            for (int d = 0; d < list.size() - 1; d++) {
                temp.add((list.get(d) + list.get(d + 1)) % 10);
            }
            list = temp;
        }

        list.forEach(i -> System.out.print(i));
    }
}