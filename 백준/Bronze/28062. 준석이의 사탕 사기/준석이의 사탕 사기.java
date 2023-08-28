import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] candy = new int[N];

        for (int i = 0; i < N; i++) {
            candy[i] = scanner.nextInt();
        }

        int result = 0;
        List<Integer> oddCandy = new ArrayList<>();

        for (int i : candy) {
            if (i % 2 == 1) {
                oddCandy.add(i);
            } else {
                result += i;
            }
        }

        if (oddCandy.size() % 2 == 1) {
            Collections.sort(oddCandy, Collections.reverseOrder());
            oddCandy.remove(oddCandy.size() - 1);
            for (int i : oddCandy) {
                result += i;
            }
        } else {
            for (int i : oddCandy) {
                result += i;
            }
        }

        System.out.println(result);
    }
}
