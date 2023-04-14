import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casecnt = 1;
        while(true) {
        	int cnt = sc.nextInt();
        	if(cnt==0) {
        		break;
        	}else {
        		for(int i=0; i<cnt;i++) {
        			int a = sc.nextInt();
        		}
        		System.out.println("Case "+casecnt+": Sorting... done!");
        		casecnt++;
        	}
        }
    }
}