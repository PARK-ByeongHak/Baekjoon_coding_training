import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String str = sc.next();

        int M = 1234567891;
        int r = 31;
        long hashValue = 0;

        for (int i = 0; i < L; i++) {
            int charValue = str.charAt(i) - 'a' + 1;
            hashValue += (long) (charValue * Math.pow(r, i)) % M;
        }

        System.out.println(hashValue % M);
    }
}
