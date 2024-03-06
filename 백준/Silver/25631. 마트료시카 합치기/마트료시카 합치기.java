import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] lst = new int[n];

        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }

        int cnt = 0;
        while (lst.length > 0) {
            Set<Integer> temp = new HashSet<>();
            for (int t : lst) {
                temp.add(t);
            }

            int[] uniqueArray = temp.stream().mapToInt(Integer::intValue).toArray();

            for (int t : uniqueArray) {
                int index = indexOf(lst, t);
                if (index != -1) {
                    int[] newArray = new int[lst.length - 1];
                    System.arraycopy(lst, 0, newArray, 0, index);
                    System.arraycopy(lst, index + 1, newArray, index, lst.length - index - 1);
                    lst = newArray;
                }
            }

            cnt++;
        }

        System.out.println(cnt);
    }

    private static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
