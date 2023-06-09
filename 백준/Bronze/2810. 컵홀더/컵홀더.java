import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 줄 바꿈 문자 소비

        String s = sc.nextLine();
        String str = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'S') {
                str += "*S";
            } else {
                str += "*LL";
                i++;
            }
        }
        str += "*";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') count++;
        }
        count = Math.min(count, n);
        System.out.print(count);
    }
}
