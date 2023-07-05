import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            String temp = sc.next();

            for (int j = 0; j < temp.length(); j++) {
                for (int k = 0; k < 2; k++) {
                    if (str[i] == null) {
                        str[i] = String.valueOf(temp.charAt(j));
                    } else {
                        str[i] += temp.charAt(j);
                    }
                }
            }
        }

        boolean eyfa = true;
        for (int i = 0; i < N; i++) {
            String temp = sc.next();

            if (!str[i].equals(temp)) {
                eyfa = false;
                break;
            }
        }

        if (eyfa) {
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }
    }
}
