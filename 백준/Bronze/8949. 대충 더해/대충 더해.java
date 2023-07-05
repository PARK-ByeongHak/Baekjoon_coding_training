import java.util.Scanner;

public class Main {
    private void solution() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int gap = Math.abs(a.length() - b.length());
        if (a.length() < b.length())
            a = "0".repeat(gap) + a;
        else
            b = "0".repeat(gap) + b;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i) - '0' + b.charAt(i) - '0');
        }
        System.out.println(sb.toString());

        sc.close();
    }

    public static void main(String[] args) {
        new Main().solution();
    }
}
