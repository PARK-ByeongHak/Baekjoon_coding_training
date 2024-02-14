import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int ans = 0;
        int k = 0, o = 0;
        int km, kmh, now = 0;

        ArrayList<Pair> road = new ArrayList<>();
        ArrayList<Pair> w = new ArrayList<>();

        km = scanner.nextInt();
        kmh = scanner.nextInt();
        road.add(new Pair(km, kmh));

        for (int i = 1; i < n; i++) {
            km = scanner.nextInt();
            kmh = scanner.nextInt();
            road.add(new Pair(road.get(i - 1).first + km, kmh));
        }

        km = scanner.nextInt();
        kmh = scanner.nextInt();
        w.add(new Pair(km, kmh));

        for (int i = 1; i < m; i++) {
            km = scanner.nextInt();
            kmh = scanner.nextInt();
            w.add(new Pair(w.get(i - 1).first + km, kmh));
        }

        for (int i = 1; i <= 100; i++) {
            if (road.get(k).second < w.get(o).second && w.get(o).second - road.get(k).second > ans) {
                ans = w.get(o).second - road.get(k).second;
            }
            // System.out.printf(" %d:: %d %d :: %d %d :: %d\n", i, road.get(k).first, road.get(k).second, w.get(o).first, w.get(o).second, ans);
            if (i == 100) break;
            if (w.get(o).first == i) o++;
            if (road.get(k).first == i) k++;
        }
        System.out.println(ans);
    }

    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
