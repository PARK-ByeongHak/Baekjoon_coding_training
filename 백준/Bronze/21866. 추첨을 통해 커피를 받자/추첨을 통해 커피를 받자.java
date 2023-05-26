import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int a = sc.nextInt();
        sum+=a;
        int b = sc.nextInt();
        sum+=b;
        int c = sc.nextInt();
        sum+=c;
        int d = sc.nextInt();
        sum+=d;
        int e = sc.nextInt();
        sum+=e;
        int f = sc.nextInt();
        sum+=f;
        int g = sc.nextInt();
        sum+=g;
        int h = sc.nextInt();
        sum+=h;
        int i = sc.nextInt();
        sum+=i;
        if(sum<100) {
        	System.out.println("none");
        }else if(a>100||b>100||c>200||d>200||e>300||f>300||g>400||h>400||i>500) {
        	System.out.println("hacker");
        }else {
        	System.out.println("draw");
        }
    }
}