import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine(); // 개행 문자(\n) 제거

        for (int i = 0; i < testCase; i++) {
            String result = sc.nextLine();
            int score = calculateScore(result);
            System.out.println(score);
        }

    }

    public static int calculateScore(String result) {
        int score = 0;
        int consecutive = 0; // 연속된 O의 개수를 저장하는 변수

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'O') {
                consecutive++; // O를 만나면 연속된 O의 개수를 증가시킴
                score += consecutive; // 점수에 연속된 O의 개수를 더함
            } else {
                consecutive = 0; // X를 만나면 연속된 O의 개수를 0으로 초기화
            }
        }

        return score;
    }
}
