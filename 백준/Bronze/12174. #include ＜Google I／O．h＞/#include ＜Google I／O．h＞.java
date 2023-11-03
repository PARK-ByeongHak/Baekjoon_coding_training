import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int t = 1; t <= T; t++) {
            int B = sc.nextInt();
            sc.nextLine();
            String input = sc.nextLine();

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < B; i++) {
                int start = i * 8;
                int end = (i + 1) * 8;
                String byteStr = input.substring(start, end);

                int decimal = 0;
                for (int j = 0; j < 8; j++) {
                    if (byteStr.charAt(j) == 'I') {
                        decimal += (1 << (7 - j));
                    }
                }

                char ch = (char) decimal;
                output.append(ch);
            }

            System.out.println("Case #" + t + ": " + output.toString());
        }
    }
}

