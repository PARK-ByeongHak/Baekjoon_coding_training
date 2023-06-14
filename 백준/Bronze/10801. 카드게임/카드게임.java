import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A가 제시한 카드의 숫자를 입력 받음
        int[] cardsA = new int[10];
        for (int i = 0; i < 10; i++) {
            cardsA[i] = sc.nextInt();
        }

        // B가 제시한 카드의 숫자를 입력 받음
        int[] cardsB = new int[10];
        for (int i = 0; i < 10; i++) {
            cardsB[i] = sc.nextInt();
        }

        int winsA = 0; // A의 승리 횟수
        int winsB = 0; // B의 승리 횟수

        // 각 라운드에서 A와 B가 제시한 카드의 숫자를 비교하여 승리 횟수를 계산
        for (int i = 0; i < 10; i++) {
            if (cardsA[i] > cardsB[i]) {
                winsA++;
            } else if (cardsA[i] < cardsB[i]) {
                winsB++;
            }
        }

        // 최종적으로 승리 횟수를 비교하여 게임의 승자를 출력
        if (winsA > winsB) {
            System.out.println("A");
        } else if (winsA < winsB) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}
