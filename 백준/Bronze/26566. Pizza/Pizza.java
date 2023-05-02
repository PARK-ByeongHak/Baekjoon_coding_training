import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int A1 = sc.nextInt();
            int P1 = sc.nextInt();
            int R1 = sc.nextInt();
            int P2 = sc.nextInt();

            double sliceArea = A1 / Math.PI;
            double sliceValue = sliceArea / P1;
            double wholeValue = Math.PI * Math.pow(R1, 2) / P2;

            if (sliceValue > wholeValue) {
                System.out.println("Slice of pizza");
            } else {
                System.out.println("Whole pizza");
            }
        }
    }
}
