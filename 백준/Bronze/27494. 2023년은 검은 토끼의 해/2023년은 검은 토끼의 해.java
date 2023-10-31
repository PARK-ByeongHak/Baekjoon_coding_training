import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.length() >= 4 && canMake2023(s)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    // Helper function to check if a number can make 2023
    private static boolean canMake2023(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n - 3; i++) {
            if (chars[i] == '2') {
                for (int j = i + 1; j < n - 2; j++) {
                    if (chars[j] == '0') {
                        for (int k = j + 1; k < n - 1; k++) {
                            if (chars[k] == '2') {
                                for (int l = k + 1; l < n; l++) {
                                    if (chars[l] == '3') {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
