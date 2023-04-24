import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        double S = sc.nextDouble();
        double G = sc.nextDouble();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double L = sc.nextDouble();
        double R = sc.nextDouble();

        // 시간 계산
        double lwait = L / A;
        double rwait = R / B;

        double lv = M / G + (M % G == 0 ? 0 : 1);
        double rv = M / S + (M % S == 0 ? 0 : 1);

        if (lv + lwait < rv + rwait) {
            System.out.println("friskus");
        } else {
            System.out.println("latmask");
        }
    }
}
