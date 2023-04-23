import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        //백색과 흑색을 번갈아 놓기 때문에
        if(a>=b) System.out.println(b);// 백색이 더 많으면 흑색 갯수 전부 출력
        else System.out.println(a+1);// 흑색이 더 많으면 흑백흑백흑 ... 흑백흑 으로 끝날 수 있도록 백색 갯수+1개 출력
    }
}
