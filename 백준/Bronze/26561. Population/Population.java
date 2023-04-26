import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int beginNum = sc.nextInt();
            int time = sc.nextInt();

            int plusNum = time / 4;
            int minusNum = time / 7;

            int population = beginNum + plusNum - minusNum;

            System.out.println(population);
        }
    }
}