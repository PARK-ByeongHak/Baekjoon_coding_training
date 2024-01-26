import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static int n, k, cnt, sum;
    public static Vector<Integer> v;
    public static int[] arr;
    public static int[] arr2;

    public static int big(int num) {
        for (int i = 0; i < v.size(); i++) {
            if (num == v.get(i)) {
                v.set(i, 0);
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        k = scanner.nextInt();
        cnt = 0;
        sum = 0;
        v = new Vector<>();
        arr = new int[n];
        arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);

        int c = 0;
        for (int i = n - 1; c < k; i--) {
            v.add(arr2[i]);
            c++;
        }

        for (int i = 0; i < n; i++) {
            if (big(arr[i]) == 1 && cnt < k) {
                sum += arr[i] - cnt;
                cnt++;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
