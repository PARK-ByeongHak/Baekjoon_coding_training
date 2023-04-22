import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();	// a지점에서 b지점으로 가는데 걸리는 시간(시간)
        int y = sc.nextInt();	// b지점에서 c지점으로 가는데 걸리는 시간(시간)	
        int z = sc.nextInt();	// a지점에서 b를 거쳐 c로 가는 조건(시간)	

        if(x+y>z) {
        	System.out.println("0");
        }else {
        	System.out.println("1");
        }
    }
}
