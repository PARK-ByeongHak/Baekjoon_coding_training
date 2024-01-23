import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax1, ay1, ax2, ay2;
        int bx1, by1, bx2, by2;

        ax1 = scanner.nextInt();
        ay1 = scanner.nextInt();
        ax2 = scanner.nextInt();
        ay2 = scanner.nextInt();
        bx1 = scanner.nextInt();
        by1 = scanner.nextInt();
        bx2 = scanner.nextInt();
        by2 = scanner.nextInt();

        String result = checkRelationship(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        System.out.println(result);
    }

    private static String checkRelationship(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        if (ax1 > bx1) {
            // Swap values to make sure ax1 <= bx1
            int temp = ax1;
            ax1 = bx1;
            bx1 = temp;

            temp = ay1;
            ay1 = by1;
            by1 = temp;

            temp = ax2;
            ax2 = bx2;
            bx2 = temp;

            temp = ay2;
            ay2 = by2;
            by2 = temp;
        }

        if (ax2 == bx1) {
            if (ay2 == by1 || ay1 == by2) {
                return "POINT";
            } else if (ay1 <= by1 && by1 <= ay2 || ay1 <= by2 && by2 <= ay2 || by1 <= ay1 && ay1 <= by2) {
                return "LINE";
            }
        } else if (ax2 > bx1) {
            if (by2 < ay1 || ay2 < by1) {
                return "NULL";
            } else if (by2 == ay1 || ay2 == by1) {
                return "LINE";
            } else {
                return "FACE";
            }
        }

        return "NULL";
    }
}
