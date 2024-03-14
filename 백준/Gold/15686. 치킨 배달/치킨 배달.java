import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] city;
    static ArrayList<int[]> chickens = new ArrayList<>();
    static ArrayList<int[]> houses = new ArrayList<>();
    static int minDist = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        city = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                city[r][c] = sc.nextInt();
                if (city[r][c] == 2) {
                    chickens.add(new int[]{r, c});
                } else if (city[r][c] == 1) {
                    houses.add(new int[]{r, c});
                }
            }
        }

        selectChickens(new ArrayList<>(), 0);
        System.out.println(minDist);
        sc.close();
    }

    static void selectChickens(ArrayList<int[]> selected, int idx) {
        if (selected.size() == M) {
            minDist = Math.min(minDist, calculateCityDist(selected));
            return;
        }

        for (int i = idx; i < chickens.size(); i++) {
            selected.add(chickens.get(i));
            selectChickens(selected, i + 1);
            selected.remove(selected.size() - 1);
        }
    }

    static int calculateCityDist(ArrayList<int[]> selected) {
        int distSum = 0;
        for (int[] house : houses) {
            int houseDist = Integer.MAX_VALUE;
            for (int[] chicken : selected) {
                int dist = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                houseDist = Math.min(houseDist, dist);
            }
            distSum += houseDist;
        }
        return distSum;
    }
}
