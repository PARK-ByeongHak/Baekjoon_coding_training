import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bx = sc.nextInt(), By = sc.nextInt();// 베시
        int Dx = sc.nextInt(), Dy = sc.nextInt();// 데이지
        int Jx = sc.nextInt(), Jy = sc.nextInt();// 존
        int B = Math.max(Math.abs(Jx-Bx), Math.abs(Jy-By));
        int D = Math.abs(Jx-Dx) + Math.abs(Jy-Dy);
        if (B == D)
            System.out.println("tie");
        else if (B < D)
            System.out.println("bessie");
        else
            System.out.println("daisy");
    }
}