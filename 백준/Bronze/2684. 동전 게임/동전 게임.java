import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        scanner.nextLine();

        while (p-- > 0) {
            String c = scanner.nextLine();
            int[] coin = new int[8];

            for (int i = 0; i < 38; i++) {
                if (c.charAt(i) == 'H') {
                    if (c.charAt(i + 1) == 'H') {
                        if (c.charAt(i + 2) == 'H') {
                            coin[7]++;
                        } else {
                            coin[6]++;
                        }
                    } else {
                        if (c.charAt(i + 2) == 'H') {
                            coin[5]++;
                        } else {
                            coin[4]++;
                        }
                    }
                } else {
                    if (c.charAt(i + 1) == 'H') {
                        if (c.charAt(i + 2) == 'H') {
                            coin[3]++;
                        } else {
                            coin[2]++;
                        }
                    } else {
                        if (c.charAt(i + 2) == 'H') {
                            coin[1]++;
                        } else {
                            coin[0]++;
                        }
                    }
                }
            }

            for (int i = 0; i < 8; i++) {
                System.out.print(coin[i] + " ");
            }
            System.out.println();
        }
    }
}