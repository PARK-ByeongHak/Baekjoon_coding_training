import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] li = new int[n];

        for (int i = 0; i < n; i++) {
            li[i] = scanner.nextInt();
        }

        Arrays.sort(li); // 카드를 오름차순으로 정렬

        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += li[i];
        }

        System.out.println(sum);
    }
}
