import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] r = new int[53];
        int[] a = new int[53];
        
        int n = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 처리

        int s;
        for (int i = 0; i < n; i++) {
            s = scanner.nextInt();
            a[s]++;
        }

        scanner.nextLine();  // 개행 문자 처리
        String str = scanner.nextLine();

        //  'A' - 64 = 1, 'Z' - 64 = 26, 'a' - 70 = 27, 'z' - 70 = 52

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if ('a' <= currentChar && currentChar <= 'z') {
                r[currentChar - 70]++;
            } else if ('A' <= currentChar && currentChar <= 'Z') {
                r[currentChar - 64]++;
            } else if (currentChar == ' ') {
                r[0]++;
            }
        }

        boolean check = true;

        for (int i = 1; i < 53; i++) {
            if (a[i] != r[i]) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
    }
}
