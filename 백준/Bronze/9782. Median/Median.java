import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = sc.nextInt();
            }
            double median;
            if (n % 2 == 1) {
                median = data[(n + 1) / 2 - 1];
            } else {
                int mid = n / 2;
                median = (double) (data[mid - 1] + data[mid]) / 2;
            }
            System.out.printf("Case %d: %.1f\n", caseNum, median);
            caseNum++;
        }
    }
}
