import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        //조건이 a<=b<=c<=d 이므로 (a+d) - (b+c) 를 하고 abs 로 절대값으로 만들어서 출력하면 된다.
        System.out.println(Math.abs((a+d) - (b+c)));
    }
}