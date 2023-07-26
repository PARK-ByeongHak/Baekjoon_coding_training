import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int result = countStandCards(arr);
        System.out.println(result);
    }

    static int countStandCards(int[] arr) {
        Arrays.sort(arr);
        int needToDelete = arr.length;
        int nextCard = 1;
        for (int i = 0; i < arr.length; i++) {
            if (nextCard == arr[i]) {
                needToDelete--;
                nextCard++;
            }
        }
        return needToDelete;
    }
}
