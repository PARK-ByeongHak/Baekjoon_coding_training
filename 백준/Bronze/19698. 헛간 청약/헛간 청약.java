import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
        int wcnt=0, hcnt=0;
        while(true) {
        	if(w<l) {
        		break;
        	}
        	w-=l;
        	wcnt++;
        }
        while(true) {
        	if(h<l) {
        		break;
        	}
        	h-=l;
        	hcnt++;
        }
        if(wcnt*hcnt>n) {
        	System.out.println(n);
        }else {
        	System.out.println(wcnt*hcnt);
        }
    }
}