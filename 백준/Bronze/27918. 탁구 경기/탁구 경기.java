import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();	// a지점에서 b지점으로 가는데 걸리는 시간(시간)
        int d = 0;	// b지점에서 c지점으로 가는데 걸리는 시간(시간)	
        int p = 0;	// a지점에서 b를 거쳐 c로 가는 조건(시간)	
        for(int i=0; i<t; i++) {
        	String str = sc.next();
        	if(d+2==p||d==p+2) {
        		continue;
        	}
        	if(str.equals("D")) {
        		d++;
        	}
        	if(str.equals("P")) {
        		p++;
        	}
        }
        System.out.println(d+":"+p);
    }
}
