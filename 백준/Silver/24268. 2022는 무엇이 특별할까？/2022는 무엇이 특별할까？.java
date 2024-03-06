import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long d = scanner.nextLong();
        long ans = findSmallestNumber(N, d);
        System.out.println(ans);
    }

    private static long findSmallestNumber(long N, long d) {
        long[] v = new long[(int) d];
        long[] fact = new long[(int) d];

        fact[0] = 1;
        for (int i = 1; i < d; i++) {
            fact[i] = fact[i - 1] * d;
        }

        for (int i = 0; i < d; i++) {
            v[i] = i;
        }

        boolean flag = true;
        long ans = -1;

        while (flag) {
            if (v[0] != 0) {
                long tmp = 0;
                for (int i = 0; i < d; i++) {
                    tmp += v[i] * fact[(int) (d - 1 - i)];
                }
                if (tmp > N) {
                    ans = tmp;
                    break;
                }
            }
            flag = nextPermutation(v);
        }

        return ans;
    }

    private static boolean nextPermutation(long[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        long temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}
