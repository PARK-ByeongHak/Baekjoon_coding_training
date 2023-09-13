import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int minCount = getMinCount(s);
        System.out.println(minCount);
    }

    public static int getMinCount(String s) {
        int minCount = Integer.MAX_VALUE;

        for (char c : "HIARC".toCharArray()) {
            int count = 0;
            for (char sc : s.toCharArray()) {
                if (sc == c) {
                    count++;
                }
            }
            minCount = Math.min(minCount, count);
        }

        return minCount;
    }
}
