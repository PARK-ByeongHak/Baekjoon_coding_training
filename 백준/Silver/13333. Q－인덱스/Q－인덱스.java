import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, k = 0, t;
        Vector<Integer> v = new Vector<>();

        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            t = scanner.nextInt();
            v.add(t);
        }

        v.sort(null);

        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) >= k && n - i >= k) {
                k++;
                i--;
            } else if (v.get(i) < k && n - i < k) {
                k--;
                break;
            } else if (v.get(i) < k) {
                if (i == v.size() - 1)
                    k--;
                continue;
            } else if (n - i < k) {
                k--;
                break;
            }
        }

        System.out.println(k);

        scanner.close();
    }
}
