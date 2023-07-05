import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        String[] palindromes = sc.nextLine().split(" ");

        boolean canPlay = true;

        // 첫 번째 문자열과 마지막 문자열을 비교하여 끝말잇기 가능 여부 확인
        for (int i = 0; i < N - 1; i++) {
            if (palindromes[i].charAt(palindromes[i].length() - 1) != palindromes[i + 1].charAt(0)) {
                canPlay = false;
                break;
            }
        }

        if (canPlay) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
