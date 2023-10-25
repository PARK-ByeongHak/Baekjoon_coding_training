import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        String A, B = "Was it a cat I saw?";
        while (true) {
            A = scanner.nextLine();
            if (A.equals(B))
                break;
            for (int j = 0; j < A.length(); j += i)
                System.out.print(A.charAt(j));
            System.out.println();
            i++;
        }
    }
}