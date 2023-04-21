import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t = sc.nextInt();
        
        int t01 = t-30;
        if(t01<0) {
        	t01=0;
        }
        int t02 = t-45;
        if(t02<0) {
        	t02=0;
        }
        
        int t1 = a+((b*(t01)))*21;
        int t2 = c+((d*(t02)))*21;
        
        System.out.println(t1+" "+t2);
	}
}