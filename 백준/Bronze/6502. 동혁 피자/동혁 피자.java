import java.util.Scanner;

public class Main {
    private void checkPizzaFit(int r, int w, int l, int caseNum) {
        int diagonal = w * w + l * l; // 피자의 대각선 길이 제곱

        if (4 * r * r >= diagonal) {
            System.out.println("Pizza " + caseNum + " fits on the table.");
        } else {
            System.out.println("Pizza " + caseNum + " does not fit on the table.");
        }
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
    
        while (true) {
        int r = sc.nextInt();
            if (r == 0)
                break;
            int w = sc.nextInt();
            int l = sc.nextInt();
    
            checkPizzaFit(r, w, l, caseNum);
            caseNum++;
        }
        sc.close();
    }

    public static void main(String[] args) {
        new Main().solution();
    }
}